public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x<10) return true;
        char s[] = String.valueOf(x).toCharArray();
        for(int i=0; i<s.length/2; i++) {
            if(s[i]!= s[s.length-1-i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(1234321));
    }


}