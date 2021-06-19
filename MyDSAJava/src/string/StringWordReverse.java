package string;

//Method 1
//Step 1 :- Reverse the wholse string by one of these places
//
//1) String.reverse Function
//2) loop from i = 0 to n/2, and reverse the whole string
//        for(int i = 0; i < string.length/2; i ++){
//            swap(i , length - 1)
//        }
//
//3) have two loop variables i, j and keep checking while (i <= j)
//
//    int i=0, j = stringth.length -1
//        while(i<= j){
//            swap(i,j)
//        i++;
//            j--;
//        }
//        for(int i = 0; i < string.length/2; i ++){
//        swap(i , length - 1)
//        }
//Step 2 :-
//
//Loop over the string and reverse on word at a time
//1) a. find the first occusrence of " " and reverse all the characters before that space and repeat for no extra space
//2) find first accurance of space byt .findFirstIndex (" "). and reverse the part before and recursively
//   call yourself to till the end of the string

public class StringWordReverse {
}
