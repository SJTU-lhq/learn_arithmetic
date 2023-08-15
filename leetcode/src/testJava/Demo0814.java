package testJava;

/**
 * 星光荡开宇宙，本人闪耀其中
 *
 * @author LHQ
 * @data 2023/8/14 21:43
 */
public class Demo0814 {
    public static void main(String[] args) {

    }

    public int subarraySum(int[] nums, int k) {
        int[] sums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sums[i] += nums[i];
        }
        int count = 0;
        for (int i = 0; i < sums.length; i++) {
            for (int j = i; j < sums.length; j++) {
            }
        }
        return count;
    }
}
