package com.home;

import java.util.Scanner;

public class printInteger {

	public static void main(String[] args) {

		System.out.print("Enter an integer ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println("Number entered is " + num);

	}

}
