//Runtime: 11 ms
//Your runtime beats 18.05% of java submissions.
public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;

        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val ) {
                if (count != i)
                    nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}