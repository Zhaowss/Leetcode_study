/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个正序数组的中位数
 */

// @lc code=start


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums2.length+nums1.length;
        int[] myarray=new int[n];
        for (int i = 0; i < nums2.length+nums1.length; i++) {
         if (i<nums1.length) {
            myarray[i]=nums1[i];
         }else{
            myarray[i]=nums1[i];
         }    
        }
        int value=0;
        for (int i = 1; i < myarray.length; i++) {
          
        }

        
        return result;

    }
}
// @lc code=end

