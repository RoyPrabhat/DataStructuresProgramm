package string;
// if only one letter is missing then it's pangrammatic lipogram
import java.util.ArrayList;
import java.util.Arrays;

public class MissingLetterForPanagram {
    public static void main(String[] args)
    {
        String  s1 = "the quick brown fox jumps over the dog";
        missingLetter(s1);
    }

    private static void missingLetter(String s1) {
        Boolean[] letters = new Boolean[26];
        Arrays.fill(letters, null);
        ArrayList<Character> missingChars = new ArrayList<>();
        Arrays.fill(letters, null);
        for(int i = 0; i < s1.length(); i++){
            if(('A' <= s1.charAt(i) && s1.charAt(i) <= 'Z')){
                letters[s1.charAt(i) - 'A'] = true;
            } else if('a' <= s1.charAt(i) && s1.charAt(i) <= 'z'){
                letters[s1.charAt(i) - 'a'] = true;
            }
        }

        for(int i = 0; i < 26; i++){
            if(letters[i] == null){
               missingChars.add((char)(i+'a'));
            }
        }
        System.out.println("missing panagram " + missingChars);
    }

}


