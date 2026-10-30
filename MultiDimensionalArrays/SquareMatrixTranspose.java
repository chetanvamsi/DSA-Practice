package MultiDimensionalArrays;

public class SquareMatrixTranspose {
    public static void main(String[] args) {
        int[][] arr = {{1,2,4},{5,6,7},{8,9,0}};
        int m = arr.length;
        for(int i=0; i<m; i++){
            for(int j=0;j<=i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
    }
}
