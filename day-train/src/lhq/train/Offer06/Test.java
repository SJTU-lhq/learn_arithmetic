package lhq.train.Offer06;

import java.util.ArrayList;

public class Test {
    public static int[] reversePrint(ListNode head) {
/*        ListNode newHead = new ListNode(0);
        newHead.next = null;
        ListNode index = null;
        while (head != null){
            index = head.next;
            head.next = newHead.next;
            newHead.next = head;
            head = index;
        }

        ListNode result = newHead.next;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (result != null){
            arrayList.add(result.val);
            result = result.next;
        }
        int[] resultArray = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            resultArray[i] = arrayList.get(i);
        }
        return resultArray;*/
        ListNode index = head;
        int sum = 0;
        while (index != null){
            sum ++;
            index = index.next;
        }
        int[] result = new int[sum];
        while (head != null){
            result[sum - 1] = head.val;
            head = head.next;
            sum --;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        reversePrint(node1);
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
