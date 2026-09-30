class Solution {
    public int maximum69Number (int num) {
        int temp=num;
        int idx=0;
        int i=0;
        int res=0;
        while(temp>0){
            i++;
            int digit=temp%10;
            temp=temp/10;
            if(digit==6){
                idx=i;
            }
        }
        i=0;
        temp=num;
        while(temp>0){
            i++;
            int digit= temp%10;
            temp=temp/10;
            if(i==idx){
                digit=9;
            }
             res = res+ digit*(int)Math.pow(10, i-1);
        }
        
         return res;
    }
   
}