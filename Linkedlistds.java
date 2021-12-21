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

	// appending the elements
	public void appending(int data) {
		Node currentNode = head;

		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		Node node = new Node(data);
		node.setData(data);
		currentNode.setNext(node);
	}

	// to insert 30 between 56 and 70
	public void insertbetween(int prev, int data) {
		Node currentNode = head;

		while (currentNode.data != prev) {
			currentNode = currentNode.next;
		}
		Node node = new Node(data);
		node.next = currentNode.next;
		currentNode.next = node;
	}

	//delete the first element in the LinkedList
	public Node deletefirstele() {
        Node currentNode = head;
        head = head.next;
        return currentNode;
    }
	
	//delete the last element in the LinkedList
	
	public void deletelastele() {
        Node currentNode = head;
        Node tailprev = null;
        while(currentNode.next != null) {
        	tailprev = currentNode;
            currentNode = currentNode.next;
        }
        tailprev.next = null;
    }
	
	//to search LinkedList to find Node with value 30
	
	public Node search(int data) {
        Node currentNode = head;

        while(currentNode.next != null) {
            if(currentNode.data == data) {
                System.out.println("Element Found "+data);
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }
	
	// find the node and delete the any node
	public void findnodedelete(int data) {
        Node currentNode = head;
        Node previousNode = head;

        while(currentNode != null) {
            if(currentNode.data == data) {  //30
            //	System.out.println(currentNode);
                previousNode.next = currentNode.next;
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }
	
	//Ordered Linked List in ascending order
	
	public void ascendingorder() {
        Node currentNode = head , index = null;
        if(head == null) {
            System.out.println("List Is Empty");
            return;
        }

        while(currentNode != null) {
            index = currentNode.getNext();
            while(index != null) {
                if(currentNode.getData() > index.getData()) {
                    int temp = currentNode.getData();
                    currentNode.setData(index.getData());
                    index.setData(temp);
                }
                index = index.getNext();
            }
            currentNode = currentNode.getNext();
        }
    }
	
	// Displaying the data
	public void display() {
		Node currentNode = head;
		System.out.println("Adding the linked list element \n");
		while (currentNode != null) {
			currentNode.print();
			currentNode = currentNode.next;
		}
	}
}


