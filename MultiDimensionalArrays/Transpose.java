package MultiDimensionalArrays;

public class Transpose {
    public static void main(String[] args) {
        //1 2
        //3 4
        //5 6

        int[][] arr = {{1,2},{3,4},{5,6}};
        int m = arr.length, n = arr[0].length;
        for(int i=0; i<n; i++){ //rows
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+ " ");
            }
        }
    }
}
