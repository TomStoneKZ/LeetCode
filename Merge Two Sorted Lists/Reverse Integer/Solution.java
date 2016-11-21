public class Solution {
    public int reverse(int x) {
        try {
            return Integer.parseInt(new StringBuilder(Integer.toString(Math.abs(x))).reverse().toString())*Integer.signum(x);
        }catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(10));
        System.out.println(solution.reverse(1000000003));
    }
}