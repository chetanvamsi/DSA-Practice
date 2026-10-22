package Arrays;

public class ArrayQuestions {
    public static void main(String[] args) {
        int[] arr = {41, 21, 37, 67, 81, 90};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            // if(arr[i]>mx) mx = arr[i];
            mx = Math.max(mx,arr[i]);
        }
        System.out.println(mx);
    }
}
