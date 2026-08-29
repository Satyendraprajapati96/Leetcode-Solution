class Solution {
  
    public int minimumSwaps(int[] nums) {
        int swap=0;
        int nonZeroCount=0;
        int n=nums.length;
       for(int num: nums){
        if(num!=0) nonZeroCount++;
       }
        for(int i=0;i<nonZeroCount;i++){
            if(nums[i]==0) swap++;
        }
        return swap;
    }
    

}