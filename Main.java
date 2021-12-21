package com.Linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Linkedlistds list = new Linkedlistds();
		list.adding(70);
		list.adding(30);
		list.adding(56);
		list.display();
		System.out.println("Search the LinkedList Node value 30 : \n");
		list.search(30);
		System.out.println();
		list.display();
	}

}
