package testJava;

import java.util.*;

/**
 * @author lihaiquan (lihq@rd.netease.com)
 * @description:
 * @date 2023/8/19 16:35
 */
public class Demo081916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();  // consume the newline
        while (T-- > 0) {
            String s = sc.nextLine();
            s = s.replace("w", "vv").replace("m", "nn");
            if (canBePalindrome(s)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    private static boolean canBePalindrome(String s) {
        Map<Character, Integer> countMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        int bdpq = countMap.getOrDefault('b', 0) + countMap.getOrDefault('d', 0) +
                countMap.getOrDefault('p', 0) + countMap.getOrDefault('q', 0);
        int nu = countMap.getOrDefault('n', 0) + countMap.getOrDefault('u', 0);

        // Check if there is only one center character
        boolean centerFound = (bdpq % 2 == 1) || (nu % 2 == 1);

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            char key = entry.getKey();
            if (key != 'b' && key != 'd' && key != 'p' && key != 'q' && key != 'n' && key != 'u') {
                if (entry.getValue() % 2 == 1) {
                    if (centerFound) return false; // Another center found, can't be palindrome
                    centerFound = true;
                }
            }
        }

        return true;
    }
}
