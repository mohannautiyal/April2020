package com.home;

public class Stack {

	int arr[];
	int size;
	int top;

	// Constructor for initialize size
	public Stack(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	// method to check if stack is empty
	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	// method to check if stack is full
	public boolean isFull() {
		if (size - 1 == top)
			return true;
		else
			return false;
	}

	// method to push element into stack
	public void push(int element) {
		if (!isFull()) {
			top++;
			arr[top] = element;
		} else
			System.out.println("Stack is full");

	}

	// method to pop element out of stack
	public void pop() {
		if (!isEmpty()) {
			int popElement;
			popElement = arr[top];
			top--;
			System.out.println("Element popped is " + popElement);
		} else
			System.out.println("Stack is Empty");
	}

	// runner method to check stack methods
	public static void main(String[] args) {
		Stack stack = new Stack(3);
		System.out.println("Is the Stack Empty > " + stack.isEmpty());
		System.out.println("Is the Stack Full > " + stack.isFull());
		System.out.println("======================================");
		stack.push(4);
		stack.push(2);

		System.out.println("Is the Stack Empty > " + stack.isEmpty());
		System.out.println("======================================");
		stack.push(6);
		System.out.println("Is the Stack Full > " + stack.isFull());
		System.out.println("======================================");

		stack.pop();
		stack.push(30);
		stack.pop();
		stack.pop();
		stack.pop();

		stack.pop();

	}

}
