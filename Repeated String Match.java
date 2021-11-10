https://leetcode.com/problems/repeated-string-match/

class Solution {
    public int repeatedStringMatch(String a, String b) {
        int lena = a.length();
        int lenb = b.length();
        int temp = lenb/lena;
        var sb = new StringBuilder();
        int i = 0;
        while(i != temp){
            sb.append(a);
            i++;
        }
        if (sb.toString().contains(b)) return i;
        if ((sb.toString()+a).contains(b)) return i+1;
        if ((a + sb.toString()).contains(b)) return i+1;
        if ((a + sb.toString()+a).contains(b)) return i+2;
        
        return -1;
    }
}
