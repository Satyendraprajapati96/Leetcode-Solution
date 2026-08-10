class Solution {
    // public boolean isPossible(int maxQ,int n, int[] arr){
   boolean isPossible(int k, int n, int[] arr) {
    if (k == 0) return false; // Avoid division by zero
    int storesNeeded = 0;
    for (int quantity : arr) {
        // Calculate stores needed for this product type
        storesNeeded += (quantity + k - 1) / k;
        // Early exit if we already exceed n
        if (storesNeeded > n) return false;
    }
    return storesNeeded <= n;
}
    public int minimizedMaximum(int n, int[] arr) {
       int m=arr.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            mx=Math.max(mx,arr[i]);
        }
        int lo=1, hi=mx;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isPossible(mid,n,arr)){
               ans=mid;
               hi=mid-1;
            }
            else lo=mid+1;

        }
        return ans;

    }
}