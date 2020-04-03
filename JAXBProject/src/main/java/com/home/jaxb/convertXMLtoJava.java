package com.home.jaxb;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class convertXMLtoJava {
	
	
	//Unmarshall Example
	public static void main(String[] args) throws JAXBException {
		JAXBContext context =  JAXBContext.newInstance(Student.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		Student stu = (Student)unmarshaller.unmarshal(new File("student.xml"));
		System.out.println(stu);

	}
	
	

}
