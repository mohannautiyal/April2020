package com.home;

public class swapTwoNum {

	public static void main(String[] args) {

		int num1 = 24;
		int num2 = 30;

		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Swapping using temp variable");
		System.out.println(num1 + "  " + num2);

		int num11 = 24;
		int num21 = 30;

		num11 = num11 + num21;
		num21 = num11 - num21;
		num11 = num11 - num21;
		System.out.println("Swapping without using temp variable");
		System.out.println(num11 + "  " + num21);

	}

}
