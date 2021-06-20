package string;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args)
    {
        char[] input = "geeksforgeeks".toCharArray();
        int n = input.length;
        System.out.println(removeDuplicateMethod1(input, n)); // N*N
        System.out.println(removeDuplicateMethod2(input, n)); // NLogN
        removeDuplicateMethod3("geeksforgeeks"); // N

    }

    private static String removeDuplicateMethod1(char[] str, int n) {
        String output = "";
     //   for(int i =0; i < n; i ++){
            for(int j = 0; j< n; j++){
                int index = output.indexOf(str[j]);
                if(!( index>= 0 )){
                    output = output + str[j];
                }
            }
     //   }
        return output;
    }

    static char[] removeDuplicateMethod2(char str[], int n)
    {

        // Create a set using String characters
        // excluding '\0'
        HashSet<Character> s = new HashSet<>(n - 1);
        for(char x : str)
            s.add(x);

        char[] st = new char[s.size()];

        // Print content of the set
        int i = 0;
        for(char x : s)
            st[i++] = x;

        return st;
    }

    static void removeDuplicateMethod3(String str)
    {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
            lhs.add(str.charAt(i));

        // print string after deleting duplicate elements
        for(Character ch : lhs)
            System.out.print(ch);
    }
}
