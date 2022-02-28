package lhq.train.Offer24;

public class Test {


    public ListNode reverseList(ListNode head) {
        ListNode newHead = new ListNode(0);
        newHead.next = null;
        ListNode index = null;
        while (head != null){
            index = head.next;
            head.next = newHead.next;
            newHead.next = head;
            head = index;
        }
        return newHead.next;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

