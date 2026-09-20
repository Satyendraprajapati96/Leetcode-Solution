class Solution {
    public String processStr(String s) {
       StringBuilder result = new StringBuilder();
       for (char ele : s.toCharArray()) {
            if(ele=='*'){
               if (result.length() > 0) {
              result.deleteCharAt(result.length() - 1);
             }
            }
             else if(ele=='#'){
               result.append(result.toString());
            }
           else if(ele=='%'){
                result.reverse();
            }
           else {
            result.append(ele);
           }
        }
         return result.toString();
    }
}