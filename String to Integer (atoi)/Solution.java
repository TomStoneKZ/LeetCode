/**
 * Created by wbshi on 2016/11/4 0004.
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        String str = "2147483648";
        System.out.println(solution.myAtoi(str));
        sc.close();
    }

    public int myAtoi(String str) {
        char c;
        long data = 0;
        boolean flag = false;
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if ((c == '+' || c == '-') && i == 0)
                flag = c == '-';
            else if (c >= '0' && c <= '9') {
                data = data * 10 + c - '0';
            } else
                break;
            if (i > 8 && !flag && data > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else if (i > 8 && flag && -1 * data < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
        return (int) (flag ? data * -1 : data);
    }
}
