package com.lhq.date20210922;

/**
 * 给你一个头结点为 head 的单链表和一个整数 k ，请你设计一个算法将链表分隔为 k 个连续的部分。
 *
 * 每部分的长度应该尽可能的相等：任意两部分的长度差距不能超过 1 。这可能会导致有些部分为 null 。
 *
 * 这 k 个部分应该按照在链表中出现的顺序排列，并且排在前面的部分的长度应该大于或等于排在后面的长度。
 *
 * 返回一个由上述 k 部分组成的数组。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/split-linked-list-in-parts
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SplitLinkedListInParts725 {
    public ListNode[] splitListToParts(ListNode head, int k) {
        //先计算长度
        int n = 0;
        ListNode temp = head;
        while (temp != null){
            n++;
            temp = temp.next;
        }
        //计算商和余数
        int quotient = n / k;
        int remainder = n % k;

        ListNode[] result = new ListNode[k];
        ListNode index = head;
        for (int i = 0; i < k && index != null; i++) {
            result[i] = index;
            int size = quotient + (i < remainder ? 1 : 0);
            for (int j = 1; j < size; j++) {
                index = index.next;
            }
            ListNode next = index.next;
            index.next = null;
            index = next;
        }
        return result;
    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }