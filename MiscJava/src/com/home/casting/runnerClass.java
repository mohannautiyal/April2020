package com.home.casting;

public class runnerClass {

	public static void main(String[] args) {


		Child ch1 = new Child();
		ch1.Method1();
		ch1.Method3();
		ch1.Method4();
		System.out.println("=======================");
		
		Parent p1 = new Child();
		p1.Method1();
		p1.Method3();
		p1.Method2();
		
	}

}
