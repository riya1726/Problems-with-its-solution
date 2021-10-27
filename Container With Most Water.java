https://leetcode.com/problems/container-with-most-water/


class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int result = 0;
        while(i < j) {
            if(height[i] < height[j]) {
                result = Math.max(result, height[i]*(j-i));
                i++;
            }
            else {
                result = Math.max(result, height[j]*(j-i));
                j--;
            }
        }
        return result;
    }
}
