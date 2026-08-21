class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n= s.length();
        char[] result= s.toCharArray();
        long totalShift=0;
        for(int i=n-1; i>=0;i--){
            totalShift=(totalShift + shifts[i])%26;
            int originalPos=result[i]-'a';
            int newPos=(int)((originalPos + totalShift)%26);
            result[i]=(char) ('a'+newPos);
        }
        return new String(result);
    }
}