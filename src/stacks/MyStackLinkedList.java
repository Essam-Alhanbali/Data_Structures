package stacks;

import mylinkedlists.myLinkedListTail.MyLinkedListTail;

public class MyStackLinkedList {
    MyLinkedListTail list;
    public MyStackLinkedList() {
        list = new MyLinkedListTail();
    }


    public void push(int val) {
        list.insertEnd(val);
    }


    public java.lang.Integer pop() {
        if (isEmpty()) {
            return null;
        }

        int temp = list.getTailVal();
        list.removeEnd();
        return temp;
    }


    public int size() {
        return list.size();
    }


    public boolean isEmpty() {
        return list.isEmpty();
    }


    public java.lang.Integer top() {
        if (isEmpty()) 
            return null;

        return list.getTailVal();
    }
}
