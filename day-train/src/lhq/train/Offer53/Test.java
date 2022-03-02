package lhq.train.Offer53;

public class Test {
    public static int search(int[] nums, int target) {
        int res = 0;
        for (int i = 0; i < nums.length && nums[i] <= target; i++) {
            if(target == nums[i]){
                res++;
            }
        }
        return res;
    }

    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(i != nums[i]){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,7,7,8,8,10};
        System.out.println(search(nums, 8));
    }
}
