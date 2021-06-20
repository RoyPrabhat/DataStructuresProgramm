package Array;

import java.util.HashMap;

public class PythagoreanTriplets {
    public static void main (String[] args)
    {
        int input1[] = {3, 1, 4, 6, 5} ;
        int input2[] =  {10, 4, 6, 12, 5}  ;

        findTriplets(input1, input1.length);
        findTriplets(input2, input2.length);
    }

    private static Boolean findTriplets(int[] input, int length) {
        int[] squaredArray = new int[length];
        HashMap<Integer, Integer>  countMapSquared = new HashMap<Integer, Integer>();
        for(int i = 0; i < length; i++) {
          int square = input[i]*input[i];
            if(countMapSquared.containsKey(square)){
                countMapSquared.put(square, countMapSquared.get(square) + 1);
            } else {
                countMapSquared.put(square, 1);
            }
        }

        for(int i = 0; i < length-1; i++){
            int square = input[i]*input[i];
            for (int j=0;j<length-1; j++){
                if(i!=j){
                    int nextSquare = input[j+1]*input[j+1];
                    int difference = Math.abs(square -nextSquare);
                    if(countMapSquared.containsKey(difference)){
                        System.out.println("Triplet Exist");
                        return true;
                    }
                }
            }
        }
        System.out.println("Triplet Does not Exist");
        return false;
    }

}
