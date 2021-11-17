https://leetcode.com/problems/minimum-operations-to-make-array-equal/

class Solution {
    public int minOperations(int n) {
        int i = 0, j = n - 1, ans = 0;
        while(i < j) {
            ans += j-- - i++;
        }
        return ans;
    }
}
