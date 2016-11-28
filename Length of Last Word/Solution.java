//Runtime: 6 ms
//Your runtime beats 48.93% of java submissions.
public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.isEmpty()) return 0;
        String lastWord = "";
        boolean flag = false;
        for(int i=s.length() ; i>0; i--) {
            if(s.charAt(i-1) == ' ') {
                if(flag)
                    return lastWord.length();
            }else {
                flag = true;
                lastWord += s.charAt(i-1);
            }
        }
        return lastWord.length();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("a "));
    }
}