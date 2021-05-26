package Sorting;

import java.util.Scanner;

public class BubbleSort {
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
        bubbleSort(unSortedArray);
    }

    private static void bubbleSort(int[] unSortedArray) {
        for(int i = 0; i < unSortedArray.length; i ++){
            for(int j= 0; j < unSortedArray.length-1-i; j++){
                if(unSortedArray[j] > unSortedArray[j+1]){
                    int temp = unSortedArray[j];
                    unSortedArray[j] = unSortedArray[j+1];
                    unSortedArray[j+1] = temp;
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

}
