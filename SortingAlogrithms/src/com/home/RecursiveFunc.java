package com.home;

public class RecursiveFunc {

	int output = 1;

	public void Calc(int n) {
		if (n == 1)
			System.out.println("1 = " + output);

		else {
			System.out.print(n+" * ");
			output = output * n;
			n--;
			Calc(n);

		}

	}

	public static void main(String[] args) {

		new RecursiveFunc().Calc(12);
	}

}
