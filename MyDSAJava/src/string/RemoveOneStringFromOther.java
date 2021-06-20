package string;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RemoveOneStringFromOther {
    public static void main(String[] args)
    {
        String  input1 = "India is greatt";
        String  input2 = "Init";
        removeIfStringExist(input1,input2);
        removeIfStringExistMethod2(input1,input2);
    //    System.out.println(removeIfStringExist(input1, input2));
    }

    // Method 1 :- where number of counts don't matter
    private static void removeIfStringExist(String input1, String input2) {
        Queue queue = new LinkedList();
        int counter = 0;
        for(int i = 0; i <input1.length(); i ++){
            int exist = input2.indexOf(input1.charAt(i));
            if(!(exist >= 0)){
                queue.add(input1.charAt(i));
            }
        }
        while (!queue.isEmpty()){
            System.out.print(queue.poll());
        }
    }

    // Method 1 :- where number of counts matter
    private static void removeIfStringExistMethod2(String input1, String input2) {
        int[] countInput2 = new int[256];

        int input2Length = input2.length();
        int input1Length = input1.length();

        for(int i = 0; i < input2Length; i ++){
            countInput2[input2.charAt(i)] =  ++countInput2[input2.charAt(i)];
        }

        Queue queue = new LinkedList();

        for(int i = 0; i < input1Length; i ++){
            if(countInput2[input1.charAt(i)] > 0){
                --(countInput2[input1.charAt(i)]);
            } else {
                queue.add(input1.charAt(i));
            }
        }


        while (!queue.isEmpty()){
            System.out.print(queue.poll());
        }
    }

}
