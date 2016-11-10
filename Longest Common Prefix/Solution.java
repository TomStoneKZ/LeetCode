public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";

        String prefix = strs[0];
        int minLength = strs[0].length();
        if(minLength == 0) return "";

        for(int i=1; i<strs.length; i++) {
            if(strs[i].length() == 0) return "";

            minLength = minLength > strs[i].length()?strs[i].length():minLength;

            int j;
            for(j=0; j<minLength; j++) {
                if(prefix.charAt(j) != strs[i].charAt(j))
                    break;
            }
            prefix = prefix.substring(0,j);
            minLength = prefix.length();
        }
        return prefix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"precast","previous", "press"};
        System.out.println(solution.longestCommonPrefix(strs));
    }
}