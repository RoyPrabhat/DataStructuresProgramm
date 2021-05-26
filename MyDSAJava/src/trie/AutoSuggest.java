package trie;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class AutoSuggest {

    static TrieNode root = new TrieNode();

    public static void main(String args[]) {
        // Input keys (use only 'a' through 'z' and lower case)
        String keys[] = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
        String output[] = {"Not present in trie", "Present in trie"};



        // Construct trie
        int i;
        for (i = 0; i < keys.length ; i++)
            insert(keys[i]);


        // Search for different keys
        if(search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);

        if(search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);

        if(search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);

        if(search("thaw") == true)
            System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);

    }

    private static boolean search(String key) {
        int length = key.length();
        int index;

        TrieNode tempRoot = root;
        for (int i = 0; i < length; i++){
            index = key.charAt(i) - 'a';
            if(tempRoot.children[index] == null){
                return false;
            } else {
                tempRoot = tempRoot.children[index];
            }
        }
        return (tempRoot!= null && tempRoot.isEndOfWord);
    }

    private static void insert(String key) {
        int level;
        int length = key.length();
        int index;

        TrieNode tempRoot = root;

        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
            if (tempRoot.children[index] == null)
                tempRoot.children[index] = new TrieNode();

            tempRoot = tempRoot.children[index];
        }

        // mark last node as leaf
        tempRoot.isEndOfWord = true;
    }
}