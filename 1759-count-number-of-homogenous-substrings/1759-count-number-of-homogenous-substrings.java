class Solution {
    public int countHomogenous(String s) {
        char[] ch=s.toCharArray();
        int n=s.length();
       long  result=0;
        long  length=0;
        int MOD= 1_000_000_007;
        for(int i=0; i<n; i++){
            if(i>0 && ch[i]==ch[i-1]){
                length += 1;

            }else{
                length=1;
            }
            result =(result+length)% MOD;
        }
        return(int) result;
    }
}