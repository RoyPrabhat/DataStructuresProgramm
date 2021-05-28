package HousingInterview;

import java.util.Stack;

public class NextGreaterELement {

    public static void main(String[] args){
        int[] input = {11, 9 ,10 ,8, 21};
        findNExtGreaterElement(input);
    }

    private static void findNExtGreaterElement(int[] input) {
        Stack<Integer> stack = new Stack<>();
        stack.add(input[0]);
        for(int i = 1; i < input.length; i ++){
            int stackTop = stack.peek();
            if(input[i] > stack.peek()){
                System.out.println("Next Greater element of " + stackTop + " is " + input[i] );
                stack.pop();

                while (!stack.isEmpty()){
                    int stackTopNew = stack.peek();
                    System.out.println("Next Greater element of " + stackTopNew + " is " + input[i]);
                    stack.pop();
                }
                stack.add(input[i]);
            } else {
                stack.add(input[i]);
            }
        }

        while (!stack.isEmpty()){
            int stackTop = stack.peek();
            System.out.println("Next Greater element of " + stackTop + " is -1" );
            stack.pop();
        }

    }
}
