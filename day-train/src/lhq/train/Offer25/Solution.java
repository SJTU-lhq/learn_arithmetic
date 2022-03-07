package lhq.train.Offer25;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHeadPre = new ListNode(0);
        ListNode index = newHeadPre;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                index.next = l1;
                l1 = l1.next;
            }else {
                index.next = l2;
                l2 = l2.next;
            }
            index = index.next;
        }
        index.next = l1 == null ? l2 : l1;
        return newHeadPre.next;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
