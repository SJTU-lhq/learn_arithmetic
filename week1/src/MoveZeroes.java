/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[j] = nums[i];
                //这样之后的都是0了，不需要再循环后边一部分
                if(i != j){
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
