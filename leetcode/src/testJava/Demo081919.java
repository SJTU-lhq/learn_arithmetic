package testJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author lihaiquan (lihq@rd.netease.com)
 * @description:
 * @date 2023/8/19 19:02
 */
public class Demo081919 {
    private static int count = 0;
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

        generateB(a, 0, new int[a.length], totalSum);
        System.out.println(count);
    }

    private static void generateB(int[] a, int index, int[] b, int remainingSum) {
        if (index == a.length) {
            if (remainingSum == 0) {
                count = (count + 1) % MOD;
            }
            return;
        }

        int maxPossible = Math.min(remainingSum - (a.length - index - 1), 300);
        for (int i = 1; i <= maxPossible; i++) {
            if (i != a[index]) {
                b[index] = i;
                generateB(a, index + 1, b, remainingSum - i);
            }
        }
    }
}
