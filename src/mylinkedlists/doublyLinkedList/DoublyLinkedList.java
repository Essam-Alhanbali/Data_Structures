package mylinkedlists.doublyLinkedList;


public class DoublyLinkedList {
	Node head, tail;
	public DoublyLinkedList() {
		head = null;
		tail = null;
	}
	
	
	public void insertFirst(int id) {
		Node newNode = new Node(id);
		if (this.isEmpty()) {
			head = tail = newNode;
			return;
		}
		
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	
	
	public void insertEnd(int id) {
		Node newNode = new Node(id);
		if (this.isEmpty()) {
			head = tail = newNode;
			return;
		}
		
		newNode.prev = tail;
		tail.next = newNode;
		tail = newNode;
	}
	
	
	public void removeFirst() {
		if (this.size() == 1 || this.size() == 0) {
			head = tail = null;
			return;
		}
		head = head.next;
		head.prev = null;
		
	}
	
	
	public void removeEnd() {
		if (this.size() == 1 || this.size() == 0) {
			head = tail = null;
			return;
		}
		
		tail = tail.prev;
		tail.next = null;
	}
	
	
	public boolean isEmpty() {
		return head == null;
	}
	
	
	public int size() {
		int cnt = 0;
		Node currNode = head;
		while (currNode != null) {
			cnt++;
			currNode = currNode.next;
		}
		return cnt;
	}
	
	
	public void print() {
		Node currNode = head;
		for (int i = 0; i < this.size(); i++) {
			System.out.print(currNode.id + " ");
			currNode = currNode.next;
		}
		System.out.println();
	}
	
	
	public boolean searchByID(int id) { 
		Node currNode = head;
		while (currNode != null) {
			if (currNode.id == id) return true;
			currNode = currNode.next;
		}
		
		return false;
	}
}
