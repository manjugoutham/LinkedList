package com.Linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Linkedlistds list = new Linkedlistds();
		list.adding(70);
		list.adding(30);
		list.adding(56);
		list.display();
		list.deletelastele();
		System.out.println("After the delete the last element \n");
		list.display();
	}

}
