package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {0,2,3,9,5,6,7,8};
        int x = 10;
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; i<n; j++){
                if(arr[i] + arr[j] == x){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
