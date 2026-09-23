class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }
        
        Arrays.sort(nums);
        int n = nums.length;
        
        for (int i = 0; i < n - 3; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Early termination if the smallest possible sum exceeds target
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }
            
            // Skip if the largest possible sum with nums[i] is less than target
            if ((long) nums[i] + nums[n - 3] + nums[n - 2] + nums[n - 1] < target) {
                continue;
            }
            
            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicate values for the second element
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                
                // Early termination for the second element
                if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
                    break;
                }
                
                // Skip if the largest possible sum with nums[i] and nums[j] is less than target
                if ((long) nums[i] + nums[j] + nums[n - 2] + nums[n - 1] < target) {
                    continue;
                }
                
                int left = j + 1;
                int right = n - 1;
                
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        
                        // Skip duplicates for the third element
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        // Skip duplicates for the fourth element
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        
        return result;
    }
}