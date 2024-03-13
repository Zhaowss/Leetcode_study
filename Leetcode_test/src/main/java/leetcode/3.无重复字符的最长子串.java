package leetcode;/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution1 {

    public int lengthOfLongestSubstring(String s) {
        Set myData=new HashSet<>();
        int n=s.length();
        int last=0;
        int begin=0;
        int max=0;
        while(begin<n)
        {
            if (!myData.contains(s.charAt(begin))) {
                myData.add(s.charAt(begin));
                begin++;
            }else{
                myData.remove(s.charAt(last));
                last++;
            }
            max=Math.max(max, myData.size());
        }
        return max;
        
    }
}
// @lc code=end

