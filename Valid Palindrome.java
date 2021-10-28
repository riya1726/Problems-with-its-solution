https://leetcode.com/problems/valid-palindrome/


class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
        int len = str.length()/2;
        int i=0;
        for(int j=str.length()-1; j>=len; j--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
        }
        return true;
    }
}
