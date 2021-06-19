package stack;

import java.util.Stack;

public class ParenthesisChecker {
    public static void main (String[] args) {
        String input ="[()]{}{[()()]()}";
        Boolean b = checkParenthesis(input);
        if(b){
            System.out.println("BALANCED");
        } else {
            System.out.println("NOT BALANCED");
        }
    }

    // METHOD 1
//    private static void checkParenthesis(String input) {
//        Stack<Character> stack = new Stack();
//
//        for(int i = 0; i < input.length(); i++){
//            if(stack.isEmpty()){
//                stack.push(input.charAt(i));
//            } else {
//                if(input.charAt(i) == ']'){
//                    char temp = stack.peek();
//                    if(temp == '['){
//                        stack.pop();
//                    } else {
//                        stack.push(input.charAt(i));
//                    }
//                } else if(input.charAt(i) == ')'){
//                    char temp = stack.peek();
//                    if(temp == '('){
//                        stack.pop();
//                    } else {
//                        stack.push(input.charAt(i));
//                    }
//                } else if(input.charAt(i) == '}'){
//                    char temp = stack.peek();
//                    if(temp == '{'){
//                        stack.pop();
//                    } else {
//                        stack.push(input.charAt(i));
//                    }
//                } else {
//                    stack.push(input.charAt(i));
//                }
//            }
//        }
//
//        if(stack.isEmpty()){
//            System.out.println("Balanced");
//        } else {
//            System.out.println("Not Balanced");
//        }
//    }

    // METHOD 2
    private static Boolean checkParenthesis(String input) {
        Stack<Character> stack = new Stack();

        for(int i = 0; i < input.length(); i++){
            char entry = input.charAt(i);

            if(entry == '(' || entry == '{' || entry == '['){
                stack.push(entry);
                continue;
            }

            if (stack.isEmpty())
                return false;

            switch (entry){
                case ')' :
                    if(stack.pop() != '('){
                        return false;
                    }
                    break;
                case '}' :
                    if(stack.pop() != '{'){
                        return false;
                    }
                    break;
                case ']' :
                    if(stack.pop() != '['){
                        return false;
                    }
                    break;
            }
        }
        return  stack.isEmpty();
    }

}
