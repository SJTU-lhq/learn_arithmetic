package testJava;

import java.util.Scanner;

/**
 * @author lihaiquan (lihq@rd.netease.com)
 * @description:
 * @date 2023/8/19 19:52
 */
public class Demo08191902 {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            totalSum += a[i];
        }

        long[][] dp = new long[n+1][totalSum+1];
        dp[0][0] = 1; // 初始化：没有数字时，和为0的方法有1种

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= totalSum; j++) {
                for (int k = 1; k <= totalSum; k++) {
                    if (k != a[i-1] && j >= k) {
                        dp[i][j] = (dp[i][j] + dp[i-1][j-k]) % MOD;
                    }
                }
            }
        }

        System.out.println(dp[n][totalSum]);
    }
}
