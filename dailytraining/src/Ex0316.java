import java.util.Deque;
import java.util.LinkedList;

/**
 * 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
 */
public class Ex0316 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        /*
        用到单调队列
        如果首位值（即最大值）不在窗口区间，删除首位
        如果新增的值小于队列尾部值，加到队列尾部
        如果新增值大于队列尾部值，删除队列中比新增值小的值，如果在把新增值加入到队列中
        如果新增值大于队列中所有值，删除所有，然后把新增值放到队列首位，保证队列一直是从大到小
         */
        if(nums.length == 0 || k == 0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for(int j = 0, i = 1 - k; j < nums.length; i++, j++) {
            if(i > 0 && deque.peekFirst() == nums[i - 1])
                deque.removeFirst();
            // 保持 deque 递减
            while(!deque.isEmpty() && deque.peekLast() < nums[j])
                deque.removeLast();
            deque.addLast(nums[j]);
            // 记录窗口最大值
            if(i >= 0)
                res[i] = deque.peekFirst();
        }
        return res;
    }
}
