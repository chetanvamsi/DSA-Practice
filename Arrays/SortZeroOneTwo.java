package Arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0};
        int n = arr.length;
        //Method 1
        // int noOfZeroes = 0;
        // int noOfOnes = 0;
        // for(int i=0; i<n; i++){
        //     if(arr[i]==0) noOfZeroes++;
        //     if(arr[i]==1) noOfOnes++;
        // }
        // for(int i=0; i<n; i++){
        //     if(i<noOfZeroes) arr[i] = 0;
        //     else if(i<noOfZeroes + noOfOnes) arr[i] = 1;
        //     else arr[i] = 2;
        // }
        // for(int ele : arr){
        //     System.out.print(ele + " ");
        // }
        // System.out.println();


        //Method 2 (Dutch flag Algorthim)
        int mid = 0;
        int low = 0;
        int high = n-1;
        while(mid <= high){
            if(arr[mid]==0){
                int temp = arr[low];
                low++;mid++;
            }
            if(arr[mid]==1){
                mid++;
            }
            if(arr[mid]==2){
                swap(arr[mid],arr[high]);
                high--;
            }
        }
    }
}
