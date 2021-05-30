package string;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;

public class StringPangram {

    public static void main(String[] args)
    {
        String isPanagram = "the quick brown fox jumps over the lazy dog";
        String isntPanagram = "the quick brown fox jumps over the dog";
        System.out.println("String one :- "+ isPanagram(isPanagram));
        System.out.println("String one :- "+ isPanagram(isntPanagram));
    }

    private static Boolean isPanagram(String input) {
        HashMap<String, Boolean> alphabetMap = new HashMap<>();
        for(int i = 0; i < input.length(); i ++){
            if(!alphabetMap.containsKey(input.charAt(i)) && !("" + input.charAt(i)).equals(" ") ){
                alphabetMap.put("" + input.charAt(i), true);
            }
        }
        if(alphabetMap.size() == 26){
            return  true;
        }
        return false;
    }

}
