package lhq.train.Offer18;

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null){
            return null;
        }
        if(head.val == val){
            return head.next;
        }
        ListNode index = head;

        while(index.next != null && index.next.val != val){
            index = index.next;
        }
        if(index.next != null){
            //while就是因为index.next.val != val停下来的
            index.next = index.next.next;
        }

        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}