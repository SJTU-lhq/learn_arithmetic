package lhq.train.Offer09;

import java.util.Stack;

public class CQueue {
    Stack<Integer> A;
    Stack<Integer> B;

    public CQueue() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void appendTail(int value) {
        A.push(value);
    }

    public int deleteHead() {
        if(B.isEmpty()){
            while (! A.isEmpty()){
                B.push(A.pop());
            }
        }
        if(! B.isEmpty()){
            return B.pop();
        }else return -1;
    }

    public static void main(String[] args) {

    }


}
