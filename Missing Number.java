class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int res = -1;
        int i;
        for(i=0; i<nums.length; i++){
            if(nums[i] != i){
                res = i;
                break;         
            }
        }
        if(res == -1){
            res = i;
        }
        return res;
    }
}
