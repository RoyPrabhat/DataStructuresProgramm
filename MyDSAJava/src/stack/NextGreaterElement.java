package stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void main (String[] args) {
        int arr[] = { 0,11,8, 13, 21, 3 };
        printNGE(arr);
    }

    private static void printNGE(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        int topElement = stack.peek();
        int indexCounter = arr.length-1;
        for(int i = 1; i<= indexCounter ; i++){

            if(topElement > arr[i]){
                stack.push(arr[i]);
            } else {
                while (!stack.isEmpty() && topElement < arr[i]){
                    System.out.println("NGE for " + topElement + " is " + arr[i]);
                    stack.pop();
                    if(!stack.isEmpty()){
                        topElement = stack.peek();
                    }
                }
                if(stack.isEmpty()){
                    stack.push(arr[i]);
                }
            }
            topElement = stack.peek();
        }
        while (!stack.isEmpty()){
            System.out.println("NGE for " + stack.pop() + " is -1");
        }
    }
}
