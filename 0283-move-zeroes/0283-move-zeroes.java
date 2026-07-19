class Solution {
    public void moveZeroes(int[] nums) {
            int n=nums.length;
            int Noz=0;
            // for(int ele:nums){
            //     if (ele==0)
            //     Noz++;
            // }
         for(int j=0;j<n;j++){
         for (int i = 0; i<n-1-j; i++) {
               if (nums[i] == 0) {
                 int temp = nums[i];
                 nums[i] = nums[i+1];
                 nums[i+1] = temp;
              
              }
          }
 
        }

    }
}