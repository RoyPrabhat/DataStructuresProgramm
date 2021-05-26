package trie;

public class TrieNode {
    // 26 is the number of alphabet Characters in the english word
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;

    TrieNode(){
        isEndOfWord = false;
        for (int i = 0; i < 26; i++)
            children[i] = null;
    }
}
