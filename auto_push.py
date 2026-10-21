import subprocess
import time
from pathlib import Path
from threading import Timer, Lock

from watchdog.observers import Observer
from watchdog.events import FileSystemEventHandler

ROOT = Path(__file__).resolve().parent
DEBOUNCE_SECONDS = 5

lock = Lock()
pending_timer = None


def git(*args):
    return subprocess.run(
        ["git", *args],
        cwd=ROOT,
        capture_output=True,
        text=True,
        timeout=120
    )


def upload_changes():
    global pending_timer

    with lock:
        pending_timer = None

    try:
        result = git("add", "-A")

        if result.returncode != 0:
            print("Git add failed:", result.stderr)
            return

        result = git("diff", "--cached", "--quiet")

        if result.returncode == 0:
            return

        if result.returncode != 1:
            print("Could not check changes:", result.stderr)
            return

        result = git(
            "commit",
            "-m",
            f"Update coding practice {time.strftime('%Y-%m-%d %H:%M:%S')}"
        )

        if result.returncode != 0:
            print("Commit failed:", result.stderr)
            return

        result = git("push", "origin", "main")

        if result.returncode == 0:
            print("Successfully uploaded to GitHub!")
        else:
            print("Push failed:", result.stderr)

    except Exception as error:
        print("Error:", error)


class ChangeHandler(FileSystemEventHandler):

    def on_any_event(self, event):
        if event.is_directory:
            return

        path = Path(event.src_path)

        ignored = {".git", "__pycache__", ".venv", "venv"}

        if any(part in ignored for part in path.parts):
            return

        if path.name.endswith((".tmp", ".swp", "~")):
            return

        global pending_timer

        with lock:
            if pending_timer is not None:
                pending_timer.cancel()

            pending_timer = Timer(
                DEBOUNCE_SECONDS,
                upload_changes
            )
            pending_timer.start()


if __name__ == "__main__":

    print("Monitoring your DSA-Practice folder...")
    print("Save a file to upload changes to GitHub.")
    print("Keep this terminal open.")

    observer = Observer()
    observer.schedule(
        ChangeHandler(),
        str(ROOT),
        recursive=True
    )
    observer.start()

    try:
        while True:
            time.sleep(1)

    except KeyboardInterrupt:
        observer.stop()

        with lock:
            if pending_timer is not None:
                pending_timer.cancel()

    observer.join()