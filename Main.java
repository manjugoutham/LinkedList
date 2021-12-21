package com.Linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Linkedlistds list = new Linkedlistds();
		list.adding(56);
		list.adding(70);
		list.adding(30);
		list.display();
		list.deletefirstele();
		System.out.println("After the delete the first element \n");
		list.display();
	}

}
