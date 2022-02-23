package lhq.train.Offer30;

import java.util.LinkedList;
import java.util.Stack;

public class MinStack {
    LinkedList<Integer> A;
    LinkedList<Integer> B;

    public MinStack() {
        A = new LinkedList<>();
        B = new LinkedList<>();
    }

    public void push(int x) {
        A.addLast(x);
        if(B.isEmpty() || x <= B.peekLast() ){
            B.addLast(x);
        }
    }

    public void pop() {
        Integer removeLast = A.removeLast();
        if(removeLast.equals(B.peekLast())){
            B.removeLast();
        }
    }

    public int top() {
        return A.peekLast();
    }

    public int min() {
        return B.peekLast();
    }
}
