class Solution {
   private boolean allCaps(String word, char start , char end){
    for(int i=0; i<word.length();i++){
        char ch= word.charAt(i);
        if(ch<start || ch> end){
            return false;
        }
    }
    return true;
   }
    public boolean detectCapitalUse(String word) {
        if(word==null || word.length()==0){
            return false;
        }
        if(allCaps(word,'A','Z')){
            return true;
        }
        if(allCaps(word,'a','z')){
            return true;
        }
        if(word.charAt(0)>='A' && word.charAt(0) <= 'Z'){
            if(allCaps(word.substring(1),'a','z')){
                return true;
            }
        }
        return false;
    }
}