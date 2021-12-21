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
	
   //appending the elements
	public void appending(int data) {
		Node currentNode = head;

		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		Node node = new Node(data);
		node.setData(data);
		currentNode.setNext(node);

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
