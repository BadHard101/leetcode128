package org.example;

import java.util.Arrays;

class Solution {
    // [0,3,7,2,5,8,4,6,0,1]
    // [0,0,1,2,3,4,5,6,7,8]
    //                    ^
    
    // sum: 9
    // max: 1
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n < 2) return n;

        Arrays.sort(nums);
        int max = 1;
        int sum = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i-1]) {
                if (nums[i] == nums[i-1]+1) {
                    sum++;
                } else {
                    max = Math.max(max, sum);
                    sum = 1;
                }
            }
        }
        max = Math.max(max, sum);
        return max;
    }
}