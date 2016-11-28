//Runtime: 38 ms
//Your runtime beats 10.26% of java submissions.
public class Solution {
    public String countAndSay(int n) {
        if(n < 1) return null;
        if(n == 1) return "1";
        if(n == 2) return "11";

        String before = "11";
        String after = "11";
        char temp;
        int count;

        for(int i=2; i<n; i++) {
            temp = before.charAt(0);
            count = 1;
            after = "";
            for(int j=1; j<before.length(); j++) {
                if(before.charAt(j) != temp) {
                    after += count + temp;
                    temp = before.charAt(j);
                    count = 1;
                } else
                    count++;

            }
            after += count + temp;
            before = after;
        }
        return after;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().countAndSay(6));
    }
}