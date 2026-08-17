class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=1;i<n;i++){
            s = rle(s);
        }
        return s ;
    }
    private String rle(String s){
        char ch = s.charAt(0);
         int count =1;
         int i=1 , n= s.length();
          StringBuilder sb= new StringBuilder();
          while(i<n){
            if (s.charAt(i)==ch){
                count++;

            } 
            else 
            {
                sb.append(count).append(ch);
                count =1;
                ch= s.charAt(i);
            }
            i++;
          }
            sb.append(count).append(ch);
            return sb.toString();
    }
}