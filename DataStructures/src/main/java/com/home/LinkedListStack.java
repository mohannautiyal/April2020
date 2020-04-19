package com.home;

public class LinkedListStack {

	Node head;

	LinkedListStack() {
		head = null;
	}

	public void push(int value) {
		Node OldNode = head;
		head = new Node();
		head.value = value;
		head.next = OldNode;

	}

	public int pop() {
		int valuePopped = 0;
		if (head == null)
			System.out.println("Stack is empty");
		else {
			valuePopped = head.value;
			System.out.println("Popped value is " + valuePopped);
			head = head.next;

		}
		return valuePopped;
	}

	public static void main(String[] args) {
		LinkedListStack ll = new LinkedListStack();
		ll.pop();
		ll.push(20);
		ll.push(30);
		ll.pop();
		ll.push(15);
		ll.pop();
		ll.pop();
		ll.pop();

	}

}
