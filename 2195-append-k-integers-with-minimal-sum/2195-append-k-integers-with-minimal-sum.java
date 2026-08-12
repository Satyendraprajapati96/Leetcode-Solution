class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
         long sum = 0;
        long curr = 1;
        for (int num : nums) {
            if (curr > num) {
                continue;
            }
            long count = Math.min(k, num - curr);
            sum += (curr + curr + count - 1) * count / 2;
            k -= count;
            curr = num + 1;
            if (k == 0) {
                return sum;
            }
        }
        sum += (curr + curr + k-1L)*k / 2;
        return sum;
    }
}