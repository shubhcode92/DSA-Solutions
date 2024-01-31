static final int ALPHABET_SIZE = 26;

    // trie node
    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];

        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++) children[i] = null;
        }
    }

//Function to insert string into TRIE.
static void insert(TrieNode root, String key) 
{
    // Your code here
    int n = key.length();
    TrieNode curr = root;
    
    for (int i=0; i<n; i++) {
        int idx = key.charAt(i)-'a';
        if (curr.children[idx] == null) {
            curr.children[idx] = new TrieNode();
        }
        curr = curr.children[idx];
    }
    curr.isEndOfWord = true;
    
}

//Function to use TRIE data structure and search the given string.
static boolean search(TrieNode root, String key)
{
    // Your code here
    TrieNode curr = root;
    int n = key.length();
    for (int i=0; i<n; i++) {
        int idx = key.charAt(i)-'a';
        if (curr.children[idx] == null) {
            return false;
        }
        curr = curr.children[idx];
    }
    
    return curr.isEndOfWord == true;
}
