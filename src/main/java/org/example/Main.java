package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;
        for (int num : nums) {
            int sum = 0;

            int val = num;
            while (set.remove(val--)) sum++;

            val = num + 1;
            while (set.remove(val++)) sum++;

            max = Math.max(sum, max);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}