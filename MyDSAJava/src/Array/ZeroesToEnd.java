package Array;

import java.util.Stack;

public class ZeroesToEnd {

    // Driver method to test the above function
    public static void main(String[] args)
    {
        int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;

        System.out.print("Original array: ");
        printArray(arr, n);

        moveZerosToEnd(arr, n);
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    private static void moveZerosToEnd(int[] arr, int n) {
// Method 1
//        int j = n-1;
//        int i = 0;
//        while(i!=j){
//            if(arr[i] == 0){
//                while(arr[j] == 0)
//                    --j;
//                swap(arr, i, j--);
//            }
//            i++;
//        }
//
//        System.out.print("\nModified array: " + arr.toString());
//        printArray(arr, n);

//Method 2
//        int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
//
//        for(int i = 0; i < n; i ++ ){
//            if(arr[i] != 0){
//
//            }
//        }

        // Method 2
//        int count = 0;
//        int temp;
//        for (int i = 0; i < n; i++) {
//            if ((arr[i] != 0)) {
//                temp = arr[count];
//                arr[count] = arr[i];
//                arr[i] = temp;
//                count = count + 1;
//            }
//        }
//        System.out.print("Original array: ");

        // Method 3
        int zeroCount = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i <n ; i++){
            if(arr[i] != 0){
                stack.push(arr[i]);
            } else {
                ++zeroCount;
            }
        }
        int stackSize = stack.size();
        for(int i = 0; i<stack.size(); i++){
            arr[i] = stack.peek();
            stack.pop();
        }

        for(int i = 0; i<stack.size(); i++){
            arr[i] = stack.peek();
            stack.pop();
        }

    }

    private static void swap(int[] unSortedArray, int i, int j) {
        int temp = unSortedArray[i];
        unSortedArray[i] = unSortedArray[j];
        unSortedArray[j] = temp;
    }
}
