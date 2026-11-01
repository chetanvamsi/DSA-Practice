package MultiDimensionalArrays;

public class SpiralForms {

    public static void print(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //spiral print 
        int minr = 0, minr = m-1;
        int minc =0, maxc = n-1;
        
    }
}
