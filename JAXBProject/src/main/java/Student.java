import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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

	@XmlElement
	List<subject> subjects;

	public Student() {

	}

	public Student(String studentname, String rollno, List<subject> subjects) {
		super();
		Studentname = studentname;
		this.rollno = rollno;
		this.subjects = subjects;
	}


}
