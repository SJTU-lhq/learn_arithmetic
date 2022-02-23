package com.lhq.date20210926;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        //思路：如果当前元素之前几位的元素和为负数，则可以舍弃
        //同时计算当前值与之前和相加保存为最大值，之后每次与最大值比较取二者最大
        int previousValue = 0;
        int maxValue = nums[0];
        for (int num : nums) {
            //如果之前值小于零就只保留当前值
            previousValue = Math.max(previousValue + num, num);
            maxValue = Math.max(maxValue, previousValue);
        }
        return maxValue;
    }
}
