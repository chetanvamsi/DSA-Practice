package Arrays;

public class MergeTwoSortedArray {
    // public static void main(String[] args) {
    //     int[] a = {11,33,42,71};
    //     int[] b = {26,54,69,81};
    //     int[] c = new int[a.length + b.length];
    //     int i=0, j=0, k=0;

    //     //merging(sorting and merging from first element)
    //     while(i<a.length && j<b.length){
    //         if(a[i]<=b[j]){
    //             c[k] = a[i];
    //             i++;
    //         }
    //         else{
    //             c[k] = b[j];
    //             j++;
    //         }
    //         k++;
    //     }
    //     if(i==a.length){
    //         while(j<b.length){
    //             c[k] = b[j];
    //             j++; k++;
    //         }
    //     }
    //     if(j==b.length){
    //         while(i<a.length){
    //             c[k] = a[i];
    //             i++; k++;
    //         }
    //     }
    //     for(int ele : c){
    //         System.out.print(ele+ " ");
    //     }
    // }


        public static void main(String[] args) {
        int[] a = {11,33,42,71};
        int[] b = {26,54,69,81};
        int[] c = new int[a.length + b.length];
        int n = a.length;
        int m = b.length;
        int p = c.length;
        int i=n-1, j=m-1, k=p-1;

        //merging(sorting and merging from last element)
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k] = a[i];
                i++;
            }
            else{
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if(i==a.length){
            while(j<b.length){
                c[k] = b[j];
                j++; k++;
            }
        }
        if(j==b.length){
            while(i<a.length){
                c[k] = a[i];
                i++; k++;
            }
        }
        for(int ele : c){
            System.out.print(ele+ " ");
        }
    }
}
