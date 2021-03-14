public class MyCircularDeque {
    int size;//队列的大小
    int capacity;//队列的容量
    Node head, tail;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        this.size = 0;
        this.capacity = k;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(this.size == this.capacity){
            return false;
        }
        Node node = new Node(value);
        //如果是第一次添加，队列只有一个元素
        if(this.size == 0){
            this.head = this.tail = node;
        }else {//如果已经有元素，需要将新元素加在头
            this.head.prev = node;
            node.next = this.head;
            //连接后新元素变成头元素
            this.head = this.head.prev;
        }
        this.size ++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(this.size == this.capacity){
            return false;
        }
        Node node = new Node(value);
        //如果是第一次添加，队列只有一个元素
        if(this.size == 0){
            this.head = this.tail = node;
        }else {//如果已经有元素，需要将新元素加在尾
            this.tail.next = node;
            node.prev = this.tail;
            //连接后新元素变成尾
            this.tail = this.tail.next;
        }
        this.size ++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(this.size == 0){
            return false;
        }
        if(this.size == 1){
            this.head = this.tail = null;
        }else {
            //this.head = this.head.next;
            Node node = this.head.next;
            this.head.next = null;
            this.head = node;
            this.head.prev = null;
        }
        this.size --;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(this.size == 0){
            return false;
        }
        if(this.size == 1){
            this.head = this.tail = null;
        }else {
            Node node = this.tail.prev;
            this.tail.prev = null;
            this.tail = node;
            this.tail.next = null;
        }
        this.size --;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        return this.size > 0 ? this.head.val : -1;
    }

    /** Get the last item from the deque. */
    public int getRear() {
        return this.size > 0 ? this.tail.val : -1;
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return (this.size == 0);
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return (this.capacity == this.size);
    }
}
//利用链表实现
class Node {
    int val;
    Node prev, next;

    Node(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

