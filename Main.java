package com.Linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Linkedlistds list = new Linkedlistds();
		list.adding(70);
		list.adding(40);
		list.adding(30);
		list.adding(56);
		list.display();
		System.out.println("Before Linked List in ascending order are : ");
		list.ascendingorder();
		System.out.println("\nAfter Linked List in ascending order are : ");
		list.display();
	}

}
