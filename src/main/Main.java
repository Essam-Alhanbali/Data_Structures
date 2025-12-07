package main;

import myArrayList.MyArrayList;
import mylinkedlists.doublyLinkedList.DoublyLinkedList;
import mylinkedlists.myLinkedList.MyLinkedList;
import mylinkedlists.objLinkedList.ObjLinkedList;
import queue.MyQueue;
import stacks.MyStackArrayList;
import stacks.MyStackLinkedList;

public class Main {
	public static void main(String[] args) {
		
		// MyArrayList arr = new MyArrayList();
		// arr.push_back(1);
		// arr.push_back(2);
		// arr.push_back(3);
		// arr.push_back(4);
		// arr.push_back(5);
		// arr.push_back(6);
		// arr.push_back(7);
		// arr.push_back(8);
		// arr.push_back(9);
		// arr.push_back(10);
		// arr.push_back(11);
		// arr.push_back(12);
		// arr.push_back(13);
		// arr.push_back(14);
		// arr.push_back(15);
		// arr.deleteLast();
		// arr.push_back(16);
		// arr.print();


		
		// MyLinkedList list = new MyLinkedList();
		// list.insert(1);
		// list.insert(2);
		// list.insert(3);
		// list.insert(4);
		// list.remove();
		// list.removeFirst();
		// list.insertFirst(-1);
		// list.print();

		

		// ObjLinkedList list = new ObjLinkedList();
		// list.insertEnd("essam", 1, 20);
		// list.insertEnd("wo", 2, 19);
		// list.insertEnd("who", 3, 18);
		// list.deleteEnd();
		// list.deleteEnd();
		// list.print();



		// DoublyLinkedList list = new DoublyLinkedList();
		// list.insertEnd(1);
		// list.insertEnd(2);
		// list.insertEnd(3);
		// list.insertFirst(0);
		// list.removeEnd();
		// list.removeFirst();
		// System.out.println(list.searchByID(2));
		// System.out.println(list.searchByID(5));
		// System.out.println(list.size());
		// list.print();

		// MyStackArrayList stk = new MyStackArrayList();
		// stk.push(0);
		// stk.push(1);
		// stk.push(2);
		// stk.push(3);
		// stk.reverse();
		// System.out.println(stk.pop());
		// System.out.println(stk.size());
		

		// MyStackLinkedList stk = new MyStackLinkedList();
		// stk.push(0);
		// stk.push(1);
		// stk.push(2);
		// System.out.println(stk.pop());
		// System.out.println(stk.size());

		int arr[] = {7, 3, 10, 6, 2};

		MyQueue queue = new MyQueue();
		for (int a : arr) {
			queue.enqueue(a);
		}
	
		while (!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}

		// System.out.println(queue.dequeue());
		// queue.enqueue(3);
		// System.out.println(queue.dequeue());
		// System.out.println(queue.dequeue());
		// System.out.println(queue.dequeue());
		// System.out.println(queue.dequeue());

	}
}
