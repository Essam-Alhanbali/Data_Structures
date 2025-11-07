package main;

import unsortedArrayLIst.UnsortedArrayList;

public class Main {
	public static void main(String[] args) {
		UnsortedArrayList arr = new UnsortedArrayList();
		
		arr.push_back(1);
		arr.push_back(2);
		arr.push_back(3);
		arr.push_back(4);
		arr.push_back(5);
		arr.push_back(6);
		arr.push_back(7);
		arr.push_back(8);
		arr.push_back(9);
		arr.push_back(10);
		arr.push_back(11);
		arr.push_back(12);
		arr.push_back(13);
		arr.push_back(14);
		arr.push_back(15);
		
		arr.deleteLast();
		
		arr.push_back(16);
		
		
		
		arr.print();
	}
}
