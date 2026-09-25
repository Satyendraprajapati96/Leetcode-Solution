class Solution {
    public boolean halvesAreAlike(String s) {
    
        String vowels = "aeiouAEIOU";
        int n = s.length(), diff = 0;
        
        for (int i = 0; i < n / 2; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) diff++;
            if (vowels.indexOf(s.charAt(n / 2 + i)) != -1) diff--;
        }
        
        return diff == 0;
    }
}