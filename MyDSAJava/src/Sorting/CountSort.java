package Sorting;

import java.util.Arrays;

// Java implementation of Counting Sort
class CountSort {
    void sort(int arr[])
    {
        int inputSize = arr.length;
        int[] rangeCountArray = new int[3];
        int[] finalArray = new int[inputSize];
        Arrays.fill(rangeCountArray, 0);

        for(int i = 0; i < inputSize; i++){
            ++rangeCountArray[arr[i]];
        }

        for(int i =1; i <= 2; i++){
            rangeCountArray[i] += rangeCountArray[i-1];
        }


        for(int i = inputSize-1; i >=0; i--){
            --rangeCountArray[arr[i]];
            finalArray[rangeCountArray[arr[i]]] = arr[i];
        }

        //        for (int i = n - 1; i >= 0; i--) {
//            --count[arr[i]];
//            output[count[arr[i]]] = arr[i];
//        }

        for(int i =0; i < inputSize; i ++){
            System.out.println(finalArray[i]);
        }

        // initialize things needed for sorting
//        int n = arr.length;
//        int output[] = new int[n];
//        int count[] = new int[3];
//
//        Arrays.fill(count, 0);
//        for (int i = 0; i < n; ++i)
//            ++count[arr[i]];
//
//
//        // Change count[i] so that count[i] now contains actual
//        // position of this character in output array
//        for (int i = 1; i <= 2; ++i)
//            count[i] += count[i - 1];
//
//        // Build the output character array
//        // To make it stable we are operating in reverse order.
//        for (int i = n - 1; i >= 0; i--) {
//            --count[arr[i]];
//            output[count[arr[i]]] = arr[i];
//        }
//
//        // Copy the output array to arr, so that arr now
//        // contains sorted characters
//        for (int i = 0; i < n; ++i)
//            arr[i] = output[i];
    }

    public static void main(String args[])
    {
        CountSort ob = new CountSort();
//        char arr[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o',
//                'r', 'g', 'e', 'e', 'k', 's' };
//
        int arr[] = { 0,2,2,1,1,0,0};


        ob.sort(arr);

    }
}