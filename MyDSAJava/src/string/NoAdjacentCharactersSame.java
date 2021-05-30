package string;

import java.util.Stack;

// Question :-
// Given a string with repeated characters, the task is to rearrange characters in a string,
// so that no two adjacent characters are same.
// Note : It may be assumed that the string has only lowercase English alphabets.
// Examples:
// Input: aaabc
// Output: abaca
//
// Input: aaabb
// Output: ababa
//
// Input: aa
// Output: Not Possible
//
// Input: aaaabc
// Output: Not Possible
public class NoAdjacentCharactersSame {

    public static void main(String[] args) {
        String  s1 = "aaabc";
        noAdjacentCharSame(s1);
    }

    // Approach 1
    private static void noAdjacentCharSame(String s1) {
        Stack<Character> stack = new Stack<>();
        String finalString = "";

        for(int i = 1; i < s1.length(); i++){
            if(s1.charAt(i) == s1.charAt(i-1)){
                stack.push((char)(i+'a'));
            }
        }
    }

}
