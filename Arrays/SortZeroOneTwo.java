package Arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0};
        int n = arr.length;
        int noz = 0;
        int noo = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==0) noz++;
            if(arr[i]==1) noo++;
        }
        for(int i=0; i<n; i++){
            if(i<noz) arr[i] = 0;
            else if(i<noz + noo) arr[i] = 1;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
