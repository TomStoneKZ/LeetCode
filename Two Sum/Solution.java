class Solution{
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = solution.twoSum(nums, target);
        System.out.println("[" + indices[0] + ", " + indices[1] + "]");
    }
}