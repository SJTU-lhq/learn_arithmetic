package testJava;

import java.util.Scanner;

/**
 * @author lihaiquan (lihq@rd.netease.com)
 * @description:
 * @date 2023/8/19 11:09
 */
public class Demo0819 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine(); // Consume the newline character after reading m

        char[][] road = new char[n][m];

        for (int i = 0; i < n; i++) {
            road[i] = in.nextLine().toCharArray();
        }

        int[][] dp = new int[n][m];
        int maxSteps = Math.max(n, m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        dp[0][0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (road[i][j] == '.') {
                    for (int k = 1; k <= maxSteps; k++) {
                        if (i + k < n) {
                            dp[i + k][j] = Math.min(dp[i + k][j], dp[i][j] + 1);
                        }

                        if (j + k < m) {
                            dp[i][j + k] = Math.min(dp[i][j + k], dp[i][j] + 1);
                        }

                        if (i + k < n && j + k < m) {
                            dp[i + k][j + k] = Math.min(dp[i + k][j + k], dp[i][j] + 1);
                        }
                    }
                }
            }
        }

        int result = dp[n - 1][m - 1] == Integer.MAX_VALUE ? -1 : dp[n - 1][m - 1];
        System.out.println(result);
    }
}
