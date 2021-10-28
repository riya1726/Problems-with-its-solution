class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // int res[] = new int[nums1.length];
        // int ans = -1;
        // for(int i=0; i<nums1.length; i++) {
        //     for(int j=0; j<nums2.length-1; j++) {
        //         if(nums1[i] == nums2[j] ) {
        //             for(int k=j+1; k<nums2.length;k++){
        //                 if(nums2[k] > nums1[i]){
        //                     ans = nums2[k];
        //                     break;
        //                 }
        //             }
        //         }
        //     }
        //     res[i] = ans;
        //     ans = -1;
        // }
        // return res;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums2.length; i++) {
            if(!map.containsKey(nums2[i])) {
                map.put(nums2[i],i);
            }
        }
        for(int num: nums1) {
            int j = 0;
            if(map.containsKey(num)) {
                j = map.get(num);
            }
            if(j < nums2.length) {
                while(j != nums2.length-1) {
                    if(num < nums2[j+1]) {
                        list.add(nums2[j+1]);
                        break;
                    }
                    j++;
                }
                if(j == nums2.length-1){
                    list.add(-1);
                }
            }
        }
        for(int i=0; i<nums1.length; i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
