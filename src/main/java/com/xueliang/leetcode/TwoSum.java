package com.xueliang.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xueliang
 * @since 2019-04-22 12:33
 */
public class TwoSum {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(num, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
