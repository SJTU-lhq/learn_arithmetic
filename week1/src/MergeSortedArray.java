/**
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
        思路：因为nums1长，后边的空间多，适合从nums1后边开始处理
         */
        int flag = m + n - 1;
        int flag1 = m - 1;
        int flag2 = n - 1;
        //循环flag2
        while(flag2 >= 0){
            //当flag1大于0的时候，判断flag1和2处值大小，flag处的值等于大值，直到循环到flag2结束
            if(flag1 >= 0 && nums1[flag1] > nums2[flag2]){
                nums1[flag--] = nums1[flag1--];
            } else {
                nums1[flag--] = nums2[flag2--];
            }
        }
    }
}
