package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        int[] unSortedArray = new int[5];
        int sizeOfArray;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        sizeOfArray =sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<sizeOfArray; i++) {
            unSortedArray[i]=sc.nextInt();
        }
        selectionSort(unSortedArray);
    }

    private static void selectionSort(int[] unSortedArray) {
        for(int i =0 ; i < unSortedArray.length -1; i ++){
            int minimumIndex = i;
            for(int j = i+1; j < unSortedArray.length; j ++){
                if (unSortedArray[minimumIndex] > unSortedArray[j]){
                    minimumIndex = j;
                }
            }
            int temp = unSortedArray[minimumIndex];
            unSortedArray[minimumIndex] = unSortedArray[i];
            unSortedArray[i] = temp;
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
        unSortedArray[j] = unSortedArray[i];
        unSortedArray[i] = temp;
    }
}
