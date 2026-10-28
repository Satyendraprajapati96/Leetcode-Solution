class Solution {
    public int minimumAverageDifference(int[] nums) {
       int n = nums.length;
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        long prefixSum = 0;
        long minAvgDiff = Long.MAX_VALUE;
        int resultIndex = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            long leftCount = i + 1;
            long rightCount = n - leftCount;

            long leftAvg = prefixSum / leftCount;
            long rightAvg = rightCount == 0 ? 0 : (totalSum - prefixSum) / rightCount;

            long avgDiff = Math.abs(leftAvg - rightAvg);

            if (avgDiff < minAvgDiff) {
                minAvgDiff = avgDiff;
                resultIndex = i;
            }
        }

        return resultIndex;
    }
}
