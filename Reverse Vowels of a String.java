https://leetcode.com/problems/reverse-vowels-of-a-string/

class Solution {
    boolean check(char x)
    {
        if(x=='a'||x=='A'|| x=='e'||x=='E'|| x=='i'||x=='I'|| x=='o'||x=='O'|| x=='u'||x=='U')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String reverseVowels(String s) {
        char ch[]=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j)
        {
            if(check(ch[i]) && check(ch[j]))
            {
               char temp=ch[i];
               ch[i]=ch[j];
               ch[j]=temp;
               i++;
               j--;
            }
            else if(check(ch[i]) && !check(ch[j]))
            {
                j--;
            }
            else if(!check(ch[i]) && check(ch[j]))
            {
                i++;
            }
            else
            {
                i++;
                j--;
            }    
        }
        String ans=String.valueOf(ch);
        return ans;
    }
}
