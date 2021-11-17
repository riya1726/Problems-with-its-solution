https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int start = 0, end = nums.length-1;
        int max = 0;
        while(start<end) {
            max = Math.max(max,nums[start++] + nums[end--]);
        }
        return max;
    }
}
