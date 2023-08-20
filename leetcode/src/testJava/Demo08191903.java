package testJava;

import java.util.Scanner;

public class Demo08191903{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        int n = s.length();
        int[][] dp = new int[n][n];

        int sumVal = 0;

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j - 1]) + 1;
                }

                sumVal += dp[i][j];
            }
        }

        // Add the weight of substrings with only one character type
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                boolean sameChar = true;
                for (int k = i; k < j && sameChar; k++) {
                    if (s.charAt(k) != s.charAt(k + 1)) {
                        sameChar = false;
                    }
                }
                if (sameChar) {
                    sumVal += (len + 1) / 2;
                }
            }
        }

        System.out.println(sumVal);
    }
}
