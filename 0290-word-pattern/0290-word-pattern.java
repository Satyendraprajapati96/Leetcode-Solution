class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }
        
        HashMap<Character, String> charToWord = new HashMap<>();
        HashSet<String> usedWords = new HashSet<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = arr[i];
            
            if (charToWord.containsKey(ch)) {
                // Character already mapped — must map to the same word
                if (!charToWord.get(ch).equals(word)) {
                    return false;
                }
            } else {
                // New character — word must not already be used
                if (usedWords.contains(word)) {
                    return false;
                }
                charToWord.put(ch, word);
                usedWords.add(word);
            }
        }
        
        return true;
    }
}