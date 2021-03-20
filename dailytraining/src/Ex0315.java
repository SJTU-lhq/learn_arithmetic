import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 */
public class Ex0315 {
    public int[] intersect(int[] nums1, int[] nums2) {
        //思路是将小的数组放进hash表中，然后遍历大的数组与哈希表比较取出交集
        if(nums1.length > nums2.length){
            return intersect(nums2, nums1);
        }
        //就默认num1小
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            int count = map.getOrDefault(nums1[i], 0) + 1;
            map.put(nums1[i], count);
        }

        int intersection[] = new int[nums1.length];//最大也就是nums1那么大
        int index = 0;//最后要将intersection中有用的值返回，需要定一个标记
        //遍历num2
        for (int i = 0; i < nums2.length; i++) {
            /*
            分几种情况：如果没有就直接跳过
                        如果有，就记录一个，并且原hash表要减少1，减完之后如果没有删除key即可
             */
            int count = map.getOrDefault(nums2[i], 0);
            if(count > 0){
                intersection[index++] = nums2[i];
                count--;
                if (count > 0) {
                    map.put(nums2[i], count);
                } else {
                    map.remove(nums2[i]);
                }
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }
}
