https://leetcode.com/problems/sorting-the-sentence/submissions/


class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] res = new String[words.length];
        for(int i=0; i<words.length; i++){
            char str = words[i].charAt(words[i].length()-1);
            int n = Character.getNumericValue(str);
            res[n-1] = words[i].substring(0,words[i].length()-1);
        }
        String solution = "";
        for(String ele: res) {
            solution = solution+" "+ele;
        }
        return solution.trim();
    }
}
