package Arrays;
import java.util.*;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target element: ");
        int x = sc.nextInt();
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(arr[i]==x){
                System.out.println("Element ")
            }
        }

    }
    
}
