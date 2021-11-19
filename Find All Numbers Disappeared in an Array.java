https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int frequency[] = new int[nums.length+1];
        for(int i=0; i<nums.length; i++) {
            frequency[nums[i]]++;
        }
        for(int i=1; i<frequency.length; i++) {
            if(frequency[i] == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
