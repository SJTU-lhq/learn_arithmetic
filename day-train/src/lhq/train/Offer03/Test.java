package lhq.train.Offer03;

import java.util.HashMap;
import java.util.HashSet;

public class Test {
/*    public int findRepeatNumber(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            if(map.containsKey(num)){
                res = num;
                break;
            }
            map.put(num, true);
        }
        return res;
    }*/



    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return 0;
    }
}
