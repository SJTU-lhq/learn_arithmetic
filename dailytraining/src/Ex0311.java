/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class Ex0311 {
    public ListNode swapPairs(ListNode head) {
        //递归的终止条件
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        //从下下个节点继续交换
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
class ListNode {
      int val;
     ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }