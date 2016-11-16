import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char c: chars) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if(stack.empty()|| stack.pop() != '(')
                        return false;
                    break;
                case '}':
                    if(stack.empty()|| stack.pop() != '{')
                        return false;
                    break;
                case ']':
                    if(stack.empty()|| stack.pop() != '[')
                        return false;
                    break;
            }
        }
        if (stack.empty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("sd(dft)}[df]{dfdf}"));
    }
}