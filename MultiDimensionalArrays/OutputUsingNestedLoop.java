package MultiDimensionalArrays;

public class OutputUsingNestedLoop {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        //arr[0][0] = 9;

        //output of 2D arrays
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
    
}
