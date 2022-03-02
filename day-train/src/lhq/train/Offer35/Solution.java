package lhq.train.Offer35;

public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        //先将复制节点接在原节点后边
        for (Node node = head; node != null; node = node.next.next) {
            Node nodeCopy = new Node(node.val);
            nodeCopy.next = node.next;
            node.next = nodeCopy;
        }
        Node headNew = head.next;
        //接上random
        for (Node node = head; node != null; node = node.next.next) {
            if(node.random != null){
                node.next.random = node.random.next;
            }else {
                node.next.random = null;
            }
        }
        //在将复制节点自己连上
        for(Node node = head; node != null; node = node.next){
            Node  nodeNew = node.next;
            node.next = node.next.next;
            nodeNew.next = (nodeNew.next != null) ? nodeNew.next.next : null;
        }
        return headNew;
    }
}
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}