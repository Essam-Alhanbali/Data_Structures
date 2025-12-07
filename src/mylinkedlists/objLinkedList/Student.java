package mylinkedlists.objLinkedList;

public class Student {
	String name;
	int id;
	int age;
	
	public Student(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public void print() {
		System.out.println("name: " + this.name + ", id: " + this.id + ", age: " + this.age);
	}
}
