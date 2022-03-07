package com.lhq.date20210923;

/**
 * 给定一个整数，写一个函数来判断它是否是 3的幂次方。如果是，返回 true ；否则，返回 false 。
 *
 * 整数 n 是 3 的幂次方需满足：存在整数 x 使得 n == 3^x
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/power-of-three
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PowerOfThree326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
    public static boolean isPowerOfThree(int n) {
/*        int temp = 1;
        while(temp < n){
            if(temp == n){
                return true;
            }else {
                temp *= 3;
            }
        }
        return false;*/


        return n > 0 && 1162261467 % n == 0;
    }
}