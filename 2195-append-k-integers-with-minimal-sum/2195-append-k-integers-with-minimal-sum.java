class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
         long sum = 0;
        long current = 1;

        for (int num : nums) {

            if (current > num) {
                continue;
            }

            long count = Math.min(k, num - current);

            sum += (current + current + count - 1) * count / 2;

            k -= count;
            current = num + 1;

            if (k == 0) {
                return sum;
            }
        }

        // If we still need numbers, take them after the largest element
        sum += (current + current + k - 1L) * k / 2;

        return sum;
    }
}