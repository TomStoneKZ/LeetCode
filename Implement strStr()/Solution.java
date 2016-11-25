//Runtime: 9 ms
//Your runtime beats 59.05% of java submissions.
public class Solution {
    public int strStr(String haystack, String needle) {
        //return haystack.indexOf(needle);
        int haystackCount, needleCount;

        if((needleCount = needle.length()) == 0) return 0;
        if((haystackCount = haystack.length()) == 0) return -1;

        int max = haystackCount - needleCount;
        int j;
        for(int i = 0; i <= max; i++) {
            if(haystack.charAt(i) != needle.charAt(0))
                continue;

            for(j = 1; j < needleCount && (i+j) < haystackCount && haystack.charAt(i+j) == needle.charAt(j); j++);

            if(j == needleCount) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
       System.out.println(new Solution().strStr("aasdsder", "sde"));
    }
}