//package Sorting;
//
//import java.util.Scanner;
//
//public class MergeSort {
//
//    public static void main(String[] args){
//        int[] unSortedArray = new int[5];
//        int sizeOfArray;
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the number of elements you want to store: ");
//        sizeOfArray =sc.nextInt();
//        System.out.println("Enter the elements of the array: ");
//        for(int i=0; i<sizeOfArray; i++) {
//            unSortedArray[i]=sc.nextInt();
//        }
//        mergeSort(unSortedArray, 0, unSortedArray.length-1);
//        printArray(unSortedArray);
//    }
//
//    private static void mergeSort(int[] unSortedArray, int left, int right) {
//
//        if(left < right){
//            int middleIndex = left + (right-1)/2;
//            mergeSort(unSortedArray, left, middleIndex);
//            mergeSort(unSortedArray, middleIndex + 1, right);
//            merge(unSortedArray, left, middleIndex, right);
//        }
//        printArray(unSortedArray);
//    }
//
//    private static void merge(int[] arr, int l, int m, int r) {
//        // Find sizes of two subarrays to be merged
//        int n1 = m - l + 1;
//        int n2 = r - m;
//
//        /* Create temp arrays */
//        int L[] = new int[n1];
//        int R[] = new int[n2];
//
//        /*Copy data to temp arrays*/
//        for (int i = 0; i < n1; ++i)
//            L[i] = arr[l + i];
//        for (int j = 0; j < n2; ++j)
//            R[j] = arr[m + 1 + j];
//
//        /* Merge the temp arrays */
//
//        // Initial indexes of first and second subarrays
//        int i = 0, j = 0;
//
//        // Initial index of merged subarry array
//        int k = l;
//        while (i < n1 && j < n2) {
//            if (L[i] <= R[j]) {
//                arr[k] = L[i];
//                i++;
//            }
//            else {
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//
//        /* Copy remaining elements of L[] if any */
//        while (i < n1) {
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
//
//        /* Copy remaining elements of R[] if any */
//        while (j < n2) {
//            arr[k] = R[j];
//            j++;
//            k++;
//        }
//
//
//
////        int leftArraySize = middleIndex-left +1;
////        int rightArraySize = right-middleIndex;
////        int[] leftArray = new int[leftArraySize];
////        int[] rightArray = new int[rightArraySize];
////
////        for(int i =0; i < leftArraySize; i ++){
////            leftArray[i] = unSortedArray[i];
////        }
////
////        for(int i = 0; i < rightArraySize; i ++){
////            rightArray[i] = unSortedArray[middleIndex+1+i];
////        }
////
////        int[] finalArray = new int[right];
////        int i=0,j = 0, k=0;
////
////        while (i < leftArraySize && j < rightArraySize) {
////            if (leftArray[i] <= rightArray[j]) {
////                finalArray[k] = leftArray[i];
////                i++;
////            }
////            else {
////                finalArray[k] = rightArray[j];
////                j++;
////            }
////            k++;
////        }
////
////        while (i< middleIndex) {
////            finalArray[k] = rightArray[i];
////                i++;
////                k++;
////        }
////
////        while (j< right) {
////            finalArray[k] = rightArray[j];
////            j++;
////            k++;
////        }
////        printArray(unSortedArray);
//
//    }
//
//    private static void printArray(int[] sortedArray) {
//        for(int i = 0; i <sortedArray.length; i ++){
//            System.out.println(sortedArray[i]);
//        }
//    }
//}

/* Java program for Merge Sort */
class MergeSort
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}