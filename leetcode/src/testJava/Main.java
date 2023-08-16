package testJava;

import java.util.Scanner;

/**
 * @author lihaiquan (lihq@rd.netease.com)
 * @description:
 * @date 2023/8/12 11:33
 */
public class Main {
    public static int minWeight(String s, int x, int y) {
        int n = s.length();
        int[][] dp = new int[n + 1][y + 1];
        int[] count = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            count[i] = count[i - 1] + (s.charAt(i - 1) == '1' ? 1 : 0);
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= y; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = 1; k <= i; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - k][j - 1] + count[i] - count[i - k]);
                }
            }
        }

        return dp[n][y];
    }

    public static void main(String[] args) {
        String s = "abab";
        int x = 2;
        int y = 2;
        int minWeight = minWeight(s, x, y);
        System.out.println("最小权值为：" + minWeight);
    }
}
