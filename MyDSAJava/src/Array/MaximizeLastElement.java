package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

//Given an array arr[] consisting of N integers, rearrange the array such that it satisfies the following conditions:
//
//        arr[0] must be 1.
//        Difference between adjacent array elements should not exceed 1, that is, arr[i] – arr[i-1] ≤ 1 for all 1 ≤ i < N.
//        The permissible operations are as follows:
//
//        Rearrange the elements in any way.
//        Reduce any element to any number ≥ 1.
public class MaximizeLastElement {
    public static void main (String[] args)
    {
        int n = 4;
        int arr[] = { 3, 1, 3, 4 };

        int max = maximizeFinalElement(arr, n);
        System.out.print(max);
    }

    private static int maximizeFinalElement(int[] arr, int n) {
        Arrays.sort(arr);
        if(arr[0] != 1){
            arr[0] = 1;
        }

        for (int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] != 1){
                arr[i] = arr[i-1] + 1;
            }
        }
        return arr[arr.length-1];
    }
}
