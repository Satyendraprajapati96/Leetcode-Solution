class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        int m = word1.length;
            int n = word2.length;
            int A1i = 0, i = 0;
            int A2j = 0, j = 0;

        while (A1i < m && A2j < n) {

            if (word1[A1i].charAt(i) != word2[A2j].charAt(j))
                return false;
            i++;
            j++;
            if (i == word1[A1i].length()) {
                i = 0;
                A1i++;
            }
            if (j == word2[A2j].length()) {
                j = 0;
                A2j++;
                }
            }

       return A1i == m && A2j == n;
    }

}