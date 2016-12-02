//Runtime: 5 ms
//Your runtime beats 35.70% of java submissions.
public class Solution {
    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;

        int sum;
        int carry = 0;
        while (i>=0 && j>=0) {
            sum = a.charAt(i)-'0' + b.charAt(j)-'0' + carry;
            sb.append(sum%2);
            carry = sum/2;
            i--;
            j--;
        }
        if(i>=0) {
            while (i>=0) {
                sum = a.charAt(i) - '0' + carry;
                sb.append(sum%2);
                carry = sum/2;
                i--;
            }
        }else if(j>=0) {
            while (j>=0) {
                sum = b.charAt(j) - '0' + carry;
                sb.append(sum%2);
                carry = sum/2;
                j--;
            }
        }
        if(carry > 0) sb.append(carry);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("1", "11"));
    }
}
