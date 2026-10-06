class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] c=s.toCharArray();
        char[] d=t.toCharArray();
        int m=c.length;
        int n=d.length;
        int i=0,j=0;
        while( i<m && j<n){
            if(c[i]==d[j]){
                i++;
            }
            j++;
        }
       return i==m;
    }
}