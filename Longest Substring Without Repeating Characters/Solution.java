import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int index = 0;
        int maxLength = 0;
        int temp;
        char c;
        while(index<s.length()) {
            c = s.charAt(index);
            temp = map.getOrDefault(c, -1);
            if(temp >= start) {
                start = temp + 1;
            }
            map.put(c, index);
            maxLength = Math.max(maxLength, index - start + 1);
            index++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        System.out.println(solution.lengthOfLongestSubstring(s1));
        System.out.println(solution.lengthOfLongestSubstring(s2));
        System.out.println(solution.lengthOfLongestSubstring(s3));
    }
}
