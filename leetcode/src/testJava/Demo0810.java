package testJava;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 星光荡开宇宙，本人闪耀其中
 *
 * @author LHQ
 * @data 2023/8/10 23:19
 */
public class Demo0810 {
    public static void main(String[] args) {
        int[] arr = new int[]{100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length < 2){
        }
        Map<String, List<String>> map = new HashMap();
        for(int i = 0; i < strs.length; i++){
            String str = strs[i];
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            if(map.containsKey(str)){
                List<String> list = map.get(str);
                list.add(strs[i]);
                map.put(str, list);
            }else{
                List<String> list =  new ArrayList<>();
                list.add(strs[i]);
                map.put(str, list);
            }
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {

        }
        Collection<List<String>> values = map.values();
        return new ArrayList<>(values);
    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length < 1){
            return 0;
        }
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        Integer[] numSetArray = numSet.stream().toArray(Integer[]::new);
        Arrays.sort(numSetArray);
        int temp = 1;
        int result = 1;
        for (int i = 1; i <numSetArray.length; i++) {
            if(numSetArray[i] - numSetArray[i - 1]  == 1){
                temp++;
            }else {
                if(temp > result){
                    result = temp;
                }
                temp = 1;
            }
        }
        return temp > result? temp : result;
    }
}
