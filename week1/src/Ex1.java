/**
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Ex1 {
    public int[] plusOne(int[] digits) {
        //正常循环，从个位开始+1
        for (int i = digits.length - 1; i >= 0 ; i--) {
            //如果本位数+1不是10，直接return
            digits[i] += 1;
            //判断方法是取余数
            digits[i] = digits[i] % 10;
            if(digits[i] != 0) return digits;
            //如果不是就可以继续循环
        }
        //如果每一位都是9，需要新建一个数组首位是1，其余是0
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
