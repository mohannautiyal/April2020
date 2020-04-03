package com.home.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;



@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class subject {
	
	@XmlElement
	String subjectName;

	@XmlElement
	String teacher;

	public subject(String subjectName, String teacher) {
		super();
		this.subjectName = subjectName;
		this.teacher = teacher;
	}
	
 

public subject() {
	 
 }
}
