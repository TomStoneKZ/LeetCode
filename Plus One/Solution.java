//Runtime: 0 ms
//Your runtime beats 40.57% of java submissions.
public class Solution {
    public int[] plusOne(int[] digits) {
        int temp;
        int i;
        for(i=digits.length-1; i>=0; i--) {
            temp = digits[i] + 1;
            if(temp > 9) {
                digits[i] = temp - 10;
            }else {
                digits[i] = temp;
                break;
            }
        }
        if(i<0 && digits[0] == 0) {
            int[] results = new int[digits.length+1];
            results[0] = 1;
            return results;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] results = new Solution().plusOne(new int[]{9});

        for(int i=0; i<results.length; i++){
            System.out.print(results[i]);
        }
        System.out.println();
    }
}