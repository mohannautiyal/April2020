package com.home;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class diffWaysToCreateObject {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException,
	NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException, IOException {

//      Using New Keyword
		Student st = new Student();
		st.name = "Madan";
		System.out.println(st.name);
		System.out.println("===========================");
		
//      Using New Instance Method from Class
		Student st1 = (Student)Class.forName("com.home.Student").newInstance();	
		st1.name = "Madan1";
		System.out.println(st1.name);
		System.out.println("===========================");
		
//      Using New Instance Constructor
		Constructor<Student> con = Student.class.getConstructor();
		Student st3 = con.newInstance();
		st3.name = "Madan2";
		System.out.println(st3.name);
		System.out.println("===========================");

//      Using clone method // Constructor is not getting called
		Student st4 = (Student) st.clone();
		System.out.println(st4.name);
		System.out.println("===========================");

//      Using deserialization
		/*
		 * FileOutputStream fos = new FileOutputStream("text.txt"); ObjectOutputStream
		 * oos = new ObjectOutputStream(fos); Student s5 = new Student(); s5.name =
		 * "Madan4"; oos.writeObject(s5);
		 */
		
		FileInputStream fis = new FileInputStream("text.txt");
		ObjectInputStream os = new ObjectInputStream(fis);
		Student s6 = (Student) os.readObject();
		System.out.println(s6.name);

		
	}
	

}
