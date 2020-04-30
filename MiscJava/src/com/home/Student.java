package com.home;

import java.io.Serializable;

public class Student implements Cloneable , Serializable{
	
	String name;
	
	public Student() {
		System.out.println("This is student constructor");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
