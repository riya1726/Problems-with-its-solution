https://leetcode.com/problems/maximum-subarray/


class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        int len = nums.length;
        for(int i=1; i<len; i++){
            sum += nums[i];
            sum = Math.max(sum,nums[i]);
            max = Math.max(max,sum);
        }
        return max;
    }
}
