class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            int[] charCount = new int[26];
            for (char c : s.toCharArray()) {
                charCount[c - 'a']++;
                if (charCount[c - 'a'] > 1) {
                 return true;
                }
            }
            return false; // No duplicates, can't swap
        }
         List<Integer> diffPositions = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diffPositions.add(i);
                if (diffPositions.size() > 2) {
                    return false; // More than 2 differences
                }
            }
        }
        
        // Must have exactly 2 differences
        if (diffPositions.size() != 2) {
            return false;
        }
        
        // Check if swapping the differing positions makes strings equal
        int i = diffPositions.get(0);
        int j = diffPositions.get(1);
        return s.charAt(i) == goal.charAt(j) && s.charAt(j) == goal.charAt(i);
    }
}