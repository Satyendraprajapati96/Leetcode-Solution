class Solution {
    public int beautifulSubstrings(String s, int k) {
        int n= s.length();
        int result=0;
        for(int i=0;i<n;i++){
            int vowels =0;
            int cons=0;
            for(int j=i;j<n;j++){
                char c=s.charAt(j);
                if(isVowel(c)){
                    vowels++;
                }
                else{
                    cons++;
                }
                 if(vowels==cons && ( vowels*cons)%k==0)
              result++;
            }
           
        }
        return result;
    }
     private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}