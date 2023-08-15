package testJava;

/**
 * 星光荡开宇宙，本人闪耀其中
 *
 * @author LHQ
 * @data 2023/8/12 23:53
 */
public class Demo0812 {
    public static void main(String[] args) {

    }

    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[index] = nums[i];
                index ++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
