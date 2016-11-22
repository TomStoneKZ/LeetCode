//Runtime: 14 ms
//Your runtime beats 56.36% of java submissions.
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int count = 1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]>nums[count-1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void  main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(new Solution().removeDuplicates(nums));
    }
}