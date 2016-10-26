public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] copy = new int[nums.length]; 
        int index1 = 0;
        int index2 = nums.length - 1;
        int first = -1;
        int second = -1;
        int[] result = new int[2];
        System.arraycopy(nums, 0, copy, 0, nums.length);
        Arrays.sort(copy);
        
        while (index1 < index2) {
          if (copy[index1] + copy[index2] == target) {
              result[0] = copy[index1];
              result[1] = copy[index2];
              break;
          }else if(copy[index1] + copy[index2] < target){
              index1++;
          }else{
              index2--;
          }
        }
        for(int i = 0; i < nums.length; i++){
            if (result[0] == nums[i] && first == -1){
              first = i;
            }else if (result[1] == nums[i] && second == -1){
              second = i;
            }
        }
       
        result[0] = first;
        result[1] = second;
        return result;
    }
}