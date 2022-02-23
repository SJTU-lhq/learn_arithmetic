package com.lhq.date20210926;

/**
 * 给你两个整数 a 和 b ，不使用 运算符 + 和 - ​​​​​​​，计算并返回两整数之和。
 */
public class SumOfTwoIntegers371 {
    public int getSum(int a, int b) {
        while(b != 0){
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }
        return a;
    }
}
