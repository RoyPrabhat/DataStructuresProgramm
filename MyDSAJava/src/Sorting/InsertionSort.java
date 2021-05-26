package Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int[] unSortedArray = new int[5];
        int sizeOfArray;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        sizeOfArray = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < sizeOfArray; i++) {
            unSortedArray[i] = sc.nextInt();
        }
        insertionSort(unSortedArray);
    }

    private static void insertionSort(int[] unSortedArray) {
        for(int i = 0; i < unSortedArray.length-1; i ++) {
            for(int j = i+1; j > 0; j--){
                if(unSortedArray[j] < unSortedArray[j-1]){
                    swap(unSortedArray, j, j-1);
                }
            }
        }
        printArray(unSortedArray);
    }

    private static void printArray(int[] sortedArray) {
        for(int i = 0; i <sortedArray.length; i ++){
            System.out.println(sortedArray[i]);
        }
    }

    private static void swap(int[] unSortedArray, int i, int j) {
        int temp = unSortedArray[i];
        unSortedArray[i] = unSortedArray[j];
        unSortedArray[j] = temp;
    }
}