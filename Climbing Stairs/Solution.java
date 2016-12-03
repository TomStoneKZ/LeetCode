//Runtime: 0 ms
//Your runtime beats 11.75% of java submissions.
public class Solution {
    public int climbStairs(int n) {
        int a = 1, b = 1;
        while (--n >= 1) {
            a += b;
            b = a - b;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(4));
    }
}