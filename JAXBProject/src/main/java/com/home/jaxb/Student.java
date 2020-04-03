package com.home.jaxb;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

	@XmlElement
	String Studentname;
	@XmlElement
	String rollno;

	@XmlElementWrapper(name="subjects")
	@XmlElement
	List<subject> subject;

	public Student() {

	}

	public Student(String studentname, String rollno, List<subject> subject) {
		super();
		Studentname = studentname;
		this.rollno = rollno;
		this.subject = subject;
	}


}
