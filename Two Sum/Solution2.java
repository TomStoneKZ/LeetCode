import java.lang.System;
import java.util.Arrays;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int[] copy = new int[nums.length]; 
        int index1 = 0;
        int index2 = nums.length - 1;
        int first = -1;
        int second = -1;
        int[] result = new int[2];
        System.arraycopy(nums, 0, copy, 0, nums.length);
        System.arraycopy();
        Arrays.sort(copy);
        Arrays.sort();
        Arrays.sort();

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

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = solution.twoSum(nums, target);
        System.out.println("[" + indices[0] + ", " + indices[1] + "]");
    }
}