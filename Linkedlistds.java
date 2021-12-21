package com.Linkedlist;

public class Linkedlistds {

	Node head;

	// Adding the elements
	public void adding(int data) {
		Node node = new Node(data);
		node.setData(data);
		node.setNext(head);
		head = node;
	}
	

	//Displaying the data
	public void display() {
		Node currentNode = head;
		System.out.println("Adding the linked list element \n");
		while (currentNode != null) {
			currentNode.print();
			currentNode = currentNode.next;
		}
	}
}
