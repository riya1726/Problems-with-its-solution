https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i=0; i< nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = 0;
                nums[i+1] = 0;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] !=0){
                res =  nums[i];
            }
        }
        return res;
    }
}

Another Approach :-
 
class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();
        for(int ele:nums){
            if(hset.contains(ele)){
                hset.remove(ele);
            }
            else{
                hset.add(ele);
            }
        }
        for(int ele:hset){
            return ele;
        }
        return -1;
    }
}

Another Approach :-
  
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++) {
            if((nums[i] ^ nums[i+1]) == 0){
                i++;
            }
            else{
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
