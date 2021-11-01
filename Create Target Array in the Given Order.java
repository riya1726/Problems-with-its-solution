https://leetcode.com/problems/create-target-array-in-the-given-order/

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        
        for(int i=0;i<target.length; i++){
              if(target[index[i]] != 0 || (target[index[i]]==0 && index[i] == 0)){
                int j = target.length-2;
                while(j>=index[i]) {
                    target[j+1] = target[j];
                    j--;

                }
            }
            target[index[i]] = nums[i];

        }
        return target;
    }
}
