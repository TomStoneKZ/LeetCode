public class Solution {
    public int romanToInt(String s) {
        char[] charArray = s.toCharArray();
        int res = toNumber(charArray[0]);
        for(int i=1; i<charArray.length; i++) {
            if(toNumber(charArray[i-1])>=toNumber(charArray[i])){
                res += toNumber(charArray[i]);
            }else {
                res += toNumber(charArray[i]) - 2*toNumber(charArray[i-1]);
            }
        }
        return res;
    }

    int toNumber(char roman) {
        switch (roman){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution =new Solution();
        System.out.println(solution.romanToInt("DCXXI"));
    }
}