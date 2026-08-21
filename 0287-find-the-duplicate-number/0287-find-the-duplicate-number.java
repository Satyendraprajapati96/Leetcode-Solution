class Solution {
    public void swap(int i, int j, int[] nums){
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
    public int findDuplicate(int[] nums) {
    //    int a=nums[0];
    //    int b =nums[0];
    //    do{
    //     a=nums[a];
    //     b=nums[nums[b]];
    //    }while(a!=b);
    //    int m=nums[0];
    //    while(m!=a){
    //     m=nums[m];
    //     a=nums[a];
    //    }
    //    return m;


           // second method
       while(true){
        int ele=nums[0];
        if(nums[ele]==ele )return ele;
        swap(0,ele,nums);
       }

    }
}