package mylinkedlists.objLinkedList;

public class Node {
	Student student;
	Node next;
	
	public Node(String name, int id, int age) {
		student = new Student(name, id, age);
		this.next = null;
	}
}
