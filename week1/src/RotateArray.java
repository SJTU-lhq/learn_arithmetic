/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 */
public class RotateArray {
    /*
        反转数组。反转三次的方式更容易理解，也看起来更酷
        先全部翻转
        然后前k个反转
        剩余反转
     */
    public void rotate(int[] nums, int k) {
        //因为可能k是大于数组长度，那么只需要取余算他实际变化的位数
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int i, int j) {
        //反转的思路就是头尾互相交换，向中间收缩
        while (i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = nums[i];
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

    }
}
