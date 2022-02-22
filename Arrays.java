// Simple Array Coding
// public class Arrays {
//     public static void main(String[] args){
//         int[] arr = {10,50,122,14,23,7};
//         int sum = 0;
//         for(int i =0; i<arr.length;i++)
//         {
//             sum = sum + arr[i];
//         }
//         System.out.println("Sum of all array value are " + sum + " \nCount of array " + arr.length);
//         double avg=0;
//         avg = sum/arr.length;
//         System.out.println("average of Array is "+ avg);
//         System.out.print("*****\n   * \n  *  \n *     \n*****");
    
//         for(int d:arr) sum+=d;
//         double average = sum/arr.length;
//         System.out.println("average of Array is "+ average);

//     }
// }



//Array Sort

// public class Arrays{
//     public static void main(String[] args){
//         int[] arr={10,22,54,98,56,87,1,33,444,456,443};
//         java.util.Arrays.sort(arr);
//         for(int i:arr){
//             System.out.println(i);
//         }

//         System.out.println();

//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }


// Binary Search
public class Arrays{
    public static void main(String[] args){
        int[]arr={10,44,2,458,14,95};
        int index = java.util.Arrays.binarySearch(arr,14);
        System.out.println("Index: "+index);
    }
}