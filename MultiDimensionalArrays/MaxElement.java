package MultiDimensionalArrays;

public class MaxElement {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4},{10,20,46},{23,34,54}};
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                mx = Math.max(mx, arr[i][j]);
            }
        }
        System.out.print(mx);

    }
}
