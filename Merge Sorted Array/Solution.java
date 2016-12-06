//Runtime: 0 ms
//Your runtime beats 38.98% of java submissions.
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        while ( m!=0 && n!=0) {
            if(nums1[m-1] > nums2[n-1]){
                nums1[k] = nums1[m-1];
                m--;
            }else {
                nums1[k] = nums2[n-1];
                n--;
            }
            k--;
        }
        if(m!=0) {
            while (m!=0) {
                nums1[k] = nums1[m-1];
                m--;
                k--;
            }
        }else if(n!=0) {
            while (n!=0) {
                nums1[k] = nums2[n-1];
                n--;
                k--;
            }
        }
    }
}