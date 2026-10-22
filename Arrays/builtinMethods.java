package Arrays;
import java.util.*;
public class builtinMethods {
    public static void main(String[] args) {
        int[] arr = {41, 21, 37, 67, 81, 90};
        int n = arr.length;
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i]+" ");
        // }
        
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
