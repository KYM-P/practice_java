package LinkedList.prac;

import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<Integer> LList = new LinkedList<>();
		
		LList.addFirst(70);
		LList.addFirst(100);
		LList.addLast(10);
		LList.addLast(5);
		LList.add(50);
		
		LList.add(2, 20);
		System.out.println(LList.get(0));
		System.out.println(LList.getFirst());
		System.out.println(LList.getLast());
		System.out.println(LList.size());
		System.out.println();
		for(int i = 0; i < LList.size(); i++) {
			System.out.println(LList.get(i));
		}
	}
}
