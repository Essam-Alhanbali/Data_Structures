package queue;

// you can implement the circular array concept using the mod operator when  indexing in the array

public class MyQueue {
    private int[] arr;
    private int front,rear;
    private int maxSize;
    public MyQueue() {
        maxSize = 5;
        arr = new int[maxSize];
        front = rear = -1;
    }

    public void enqueue(int val) {
        if (this.isEmpty()) {
            front ++;
        } 
        if (this.isFull()) {
            System.out.println("queue is full.");
            return;
        } 
        // if (rear == maxSize-1 && front != 0) {
        //     rear = 0;
        // } else rear++;

        rear++;

        arr[rear%maxSize] = val;
    }

    public java.lang.Integer dequeue() {
        if (this.isEmpty()) {
            System.out.println("queue is empty.");
            return null;
        }
        int tmp = arr[front%maxSize];
        if (rear == front) { // if size = 1
            front = rear = -1;
        } else if (front == maxSize-1 && front != rear) {
            front = 0;
        } else {
            front ++;
        }
        
        return tmp;
    }

    public int size() {
        return rear-front;
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1;
    } 

    public java.lang.Integer front() {
        if (this.isEmpty()) {
            System.out.println("queue is empty.");
            return null;
        }
        return arr[front];
    }

    public boolean isFull() {
        return this.size() == maxSize;
    }
}
