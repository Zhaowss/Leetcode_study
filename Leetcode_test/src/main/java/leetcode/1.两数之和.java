package leetcode;/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start


class Solution {
   
    public int[] twoSum(int[] nums, int target) {
      int[] toanswer=new int[2];

      for (int nums2 = 0; nums2 < nums.length; nums2++) {
            for (int i = nums2+1; i < nums.length; i++) {
                int myanswer=nums[nums2]+nums[i];
                 if (myanswer==target) {
                   toanswer[0]=nums2;
                   toanswer[1]=i;
                   return  toanswer;
                 }   
            }

      }
    return null;
      
    }
}
// @lc code=end

