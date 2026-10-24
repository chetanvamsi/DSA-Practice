
package Arrays;

import java.util.*;

public class RotateArrays {

    public void rotate(int[] nums, int k) {
        int n = nums.length;

        if (n == 0) {
            return;
        }

        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArrays obj = new RotateArrays();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        obj.rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }
}


