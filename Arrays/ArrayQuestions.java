package Arrays;
                      //1Q
// public class ArrayQuestions {
//     public static void main(String[] args) {
//         int[] arr = {41, 21, 37, 67, 81, 90};
//         int n = arr.length;
//         for(int i=0; i<n; i++){
//             if(arr[i]<35){
//                 System.out.println(i);
//             }
//         }
//     }
// }


                    //2Q
// public class ArrayQuestions {
//     public static void main(String[] args) {
//         int[] arr = {41, 21, 37, 67, 81, 90};
//         int n = arr.length;
//         int mx = Integer.MIN_VALUE;
//         for(int i=0; i<n; i++){
//             // if(arr[i]>mx) mx = arr[i];
//             mx = Math.max(mx,arr[i]);
//         }
//         System.out.println(mx);
//     }
// }





                //3Q
public class ArrayQuestions {
    public static void main(String[] args) {
        int[] arr = {41, 21, 37, 67, 81, 90};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            // if(arr[i]>mx) mx = arr[i];
            mx = Math.max(mx,arr[i]);
        }

        int smx = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            
        }
        System.out.println(mx);
    }
}

