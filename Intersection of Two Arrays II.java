https://leetcode.com/problems/intersection-of-two-arrays-ii/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        ArrayList<Integer> res = new ArrayList();
        while(i<nums1.length && j<nums2.length) {
            if(nums1[i] == nums2[j]){
                res.add(nums1[i]);
                k++;
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else {
                j++;
            }
        }
    
        int[] results = new int[res.size()];
        for (int x = 0; x < res.size(); x++){
            results[x] = res.get(x);
        }
        return results;
    }
}
