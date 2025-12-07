package myArrayList;

public class MyArrayList {
	private int arr[];
	private int index;		
	
	public MyArrayList() {
		arr = new int [10];
		index = 0;
	}

	public void push_back(int val) {
		if (index >= arr.length)
			resize();
		
		arr[index++] = val;			
	}
	
	public void print() {
		for (int i = 0; i < index; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	private void resize() {
		int newarr[] = new int [arr.length * 2];	
		
		for (int i = 0; i < arr.length; i++)
			newarr[i] = arr[i];


		arr = newarr;
	}
	
	public void deleteLast() {
		if (index > 0)
			index--;
	}

	public int size() {
		return index;
	}

	public int atIndex(int ind) {
		return arr[ind];
	}

	public boolean isEmpty() {
		if (index == 0) return true;
		else return false;
	}
}
