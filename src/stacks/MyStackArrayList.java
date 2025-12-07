package stacks;

import myArrayList.MyArrayList;

public class MyStackArrayList {
    MyArrayList arrayList;
    
    public MyStackArrayList() {
        arrayList = new MyArrayList();
    }
    

    public void push(int val) {
        arrayList.push_back(val);
    }


    public java.lang.Integer pop() {
        if (isEmpty()) 
            return null;

        int temp = arrayList.atIndex(size() - 1);
        arrayList.deleteLast();
        return temp;
    }


    public int size() {
        return arrayList.size();
    }


    public boolean isEmpty() {
        return arrayList.isEmpty();
    }


    public java.lang.Integer top() {
        if (isEmpty()) 
            return null;

        return arrayList.atIndex(size() - 1);
    }


    public void reverse() {
        MyStackArrayList newstk = new MyStackArrayList();

        while (!this.isEmpty()) {
            newstk.push(this.pop());
        }

        this.arrayList = newstk.arrayList;
    }
}
