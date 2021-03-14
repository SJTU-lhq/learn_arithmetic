/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        /*
        用一个头先连接l1和l2中小的那个的节点头，然后慢慢比较较小的添进新的链表中
         */
        //定义一个头还连接下来的链表
        ListNode head = new ListNode(-1);
        //一个遍历用的指针
        ListNode prev = head;
        //开始迭代
        while (l1 != null && l2!= null){
            if (l1.val < l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        //迭代结束把剩余的链接上
        prev.next = l1 == null ? l2 : l1;
        return head.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
