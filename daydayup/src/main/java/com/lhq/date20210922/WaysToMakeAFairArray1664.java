package com.lhq.date20210922;

/**
 * 给你一个整数数组 nums 。你需要选择 恰好 一个下标（下标从 0 开始）并删除对应的元素。请注意剩下元素的下标可能会因为删除操作而发生改变。
 *
 * 比方说，如果 nums = [6,1,7,4,1] ，那么：
 *
 * 选择删除下标 1 ，剩下的数组为 nums = [6,7,4,1] 。
 * 选择删除下标 2 ，剩下的数组为 nums = [6,1,4,1] 。
 * 选择删除下标 4 ，剩下的数组为 nums = [6,1,7,4] 。
 * 如果一个数组满足奇数下标元素的和与偶数下标元素的和相等，该数组就是一个 平衡数组 。
 *
 * 请你返回删除操作后，剩下的数组 nums 是 平衡数组 的 方案数 。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ways-to-make-a-fair-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * 去除索引为ii的元素后，ii之前元素的奇偶性不变，ii之后元素的奇偶性改变，即ii之后奇/偶数下标元素的和变成了偶/奇数下标。
 *
 * 考虑奇偶元素的差值，我们求正负交替的前缀和 dp[i] = \sum_{j=0}^{i} (-1)^j nums[j-1]dp[i]=∑
 * j=0
 * i
 * ​
 *  (−1)
 * j
 *  nums[j−1]
 *
 * 那么dp[i-1]dp[i−1]表示索引ii左边部分奇偶元素差值，dp[n] - dp[i]dp[n]−dp[i]表示索引ii右边部分奇偶元素差值，去除索引ii后，dp[n] - dp[i]dp[n]−dp[i]表示索引ii右边部分奇偶元素差值的相反数。
 *
 * 因此，对任意ii，只要dp[i-1] == dp[n] - dp[i]dp[i−1]==dp[n]−dp[i]，即满足题目要求。
 *
 */

public class WaysToMakeAFairArray1664 {
    public int waysToMakeFair(int[] nums) {
        int[] dp = new int[nums.length + 1];
        // dp[i]表示(0,1,2...,i-1)的奇偶数之差(偶数和-奇数和)
        for (int i = 1; i < dp.length; i++) {
            //i&1 位运算判断奇偶
            dp[i] = dp[i - 1] + ((i & 1) == 0 ? nums[i - 1] : -nums[i - 1]);
        }
        int count = 0;
        for (int i = 1; i < dp.length; i++) {
            //当删除第 i 个元素后(下标 i-1)，此元素之前奇偶数之差为 dp[i-1](偶-奇)
            //此元素之后奇偶数之差为 dp[n]-dp[i](偶-奇)
            //由于删除 i 后，奇偶翻转，所以只需判断相等即可
            if (dp[i - 1] == dp[nums.length] - dp[i]) {
                ++count;
            }
        }
        return count;
    }
}
