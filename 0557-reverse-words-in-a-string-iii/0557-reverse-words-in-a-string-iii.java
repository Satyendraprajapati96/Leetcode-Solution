class Solution {
    public String reverseWords(String s) {
         char[] c = s.toCharArray(); 
        int n= c.length;
         int i=0;
         while(i<n){
            int j=i;
            while(j<n && c[j] != ' '){
            j++;
            }
            reverse(c,i,j-1);
            i=j+1;
        }
            return new String(c);
     }
        private void reverse(char[] c, int l, int r) {
        while (l < r) {
            char t = c[l]; c[l] = c[r]; c[r] = t;
            l++; r--;
        }
           
    }
}