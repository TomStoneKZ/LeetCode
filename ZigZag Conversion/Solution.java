import java.util.Arrays;

public class Solution {
    public String convert(String s, int numRows) {
        String[] rows = new String[numRows];
        Arrays.fill(rows, "");
        int index = 0;
        boolean flag = false;
        String result = "";
        if(numRows == 1) return s;
        for(int i=0; i<s.length(); i++) {
            rows[index] += s.charAt(i);
            if(!flag) {
                if(index == numRows-1) {
                    flag = true;
                    index--;
                }else {
                    index++;
                }
            }else {
                if(index==0) {
                    flag = false;
                    index++;
                }else {
                    index--;
                }
            }
        }
        for(int i=0; i<numRows; i++) {
            result+=rows[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "PAYPALISHIRING";
        System.out.println(solution.convert(s, 3));
    }
}