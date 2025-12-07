package mylinkedlists.objLinkedList;

public class ObjLinkedList {
	Node head;
	public ObjLinkedList() {
		head = null;
	}
	
	
	public void insertEnd(String name, int id, int age) {
		Node newNode = new Node(name, id, age);
		
		if (isEmpty()) {
			head = newNode;
			return;
		} 
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}


	public void deleteEnd() {
		if (isEmpty()) return;

		Node currNode = head;
		while (currNode.next.next != null)
			currNode = currNode.next;

		currNode .next= null;
	}
	
	
	public boolean isEmpty() {
		if (head == null) return true;
		return false;
	}
	
	public void print() {
		Node currNode = head;
		while (currNode != null) {
			currNode.student.print();
			currNode = currNode.next;
		}
		
	}
}
