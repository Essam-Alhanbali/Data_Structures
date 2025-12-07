package mylinkedlists.myLinkedListTail;

public class MyLinkedListTail {
	Node head, tail;	
	public MyLinkedListTail() {
		head = tail = null;
	}
	
	public void insertEnd(int val) {
		Node newNode = new Node(val);
		
		if (this.isEmpty())
			head = tail = newNode;
		else {
			Node currNode = head;
			while (currNode.next != null) 
					currNode = currNode.next;
			currNode.next = tail = newNode;
		}
	}
	
	
	public void insertFirst(int val) {
		if (isEmpty()) {
			this.insertEnd(val);
		} else {
			Node newNode = new Node(val);
			newNode.next = head;
			head = newNode;			
		}
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void print() {
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.id + " ");
			currNode = currNode.next;
		}
		System.out.println();
	}
	
	public void removeEnd() {
		if (this.isEmpty()) {
			return;
		} 
		if (this.size() == 1) { 
			head = tail = null;
		}
		
		else {
			Node newlastNode = head;
			Node currNode = head;
			
			while (currNode.next != null) {
				newlastNode = currNode;
				currNode = currNode.next;			
			}
			
			tail = newlastNode;
			newlastNode.next = null;			
		}
	}
	
	
	public void removeFirst() {
		if (this.isEmpty()) {
			return;
		}
		
		head = head.next;
	}
	
	public boolean exsits(int targetId) {
		Node currNode = head;
		while (currNode != null) {
			if (currNode.id == targetId) 
				return true;
			currNode = currNode.next;
		}
		
		return false;
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

	
	public int getTailVal() {
		return tail.id;
	}
}


