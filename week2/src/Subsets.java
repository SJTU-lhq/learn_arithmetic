import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        if(nums == null) {return  ans;}
        dfs(ans, nums, new ArrayList<Integer>(), 0);
        return ans;
    }

    private void dfs(ArrayList<List<Integer>> ans, int[] nums, ArrayList<Integer> list, int index) {
        if(index == nums.length){
            ans.add(new ArrayList<Integer>(list));
            return;
        }

        dfs(ans, nums ,list, index + 1);//不算当前数字
        list.add(nums[index]);
        dfs(ans, nums ,list, index + 1);

        list.remove(list.size() - 1);
    }
}
