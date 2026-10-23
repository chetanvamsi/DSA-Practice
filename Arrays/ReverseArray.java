package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        //reverse
        for(int i=0; i<n; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }
}
