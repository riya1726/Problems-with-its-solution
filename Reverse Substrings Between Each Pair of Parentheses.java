https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/

class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(char ch:s.toCharArray()) {
            if(ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '(') {
                    res.append(stack.pop());
                }
                if(!stack.isEmpty()) {
                    stack.pop();
                }
                for(char c:res.toString().toCharArray()) {
                    stack.push(c);
                }
            }
            else {
                stack.push(ch);
            }
            res = new StringBuilder();
        }
        while(!stack.isEmpty()) {
            res.insert(0,stack.pop());
        }
        return res.toString();
    }
}
