package MultiDimensionalArrays;

import java.util.*;
public class OutputUsingNestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        //arr[0][0] = 9;

        //output of 2D arrays
        for(int i=0; i<3; i++){  //rows
            for(int j=0; j<3; j++){  //cols
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
}
