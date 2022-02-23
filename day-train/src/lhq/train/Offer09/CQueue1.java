package lhq.train.Offer09;

import java.util.LinkedList;
import java.util.Stack;

public class CQueue1 {
    LinkedList<Integer> A;
    LinkedList<Integer> B;

    public CQueue1() {
        A = new LinkedList<>();
        B = new LinkedList<>();
    }

    public void appendTail(int value) {
        A.addLast(value);
    }

    public int deleteHead() {
        if(B.isEmpty()){
            while (! A.isEmpty()){
                B.addLast(A.removeLast());
            }
        }
        if(! B.isEmpty()){
            return B.removeLast();
        }else return -1;
    }
}
