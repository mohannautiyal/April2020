import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
public class converterJavaToXML {

	public static void main(String[] args) throws JAXBException {
		
		
		List<subject> sub = new ArrayList<subject>();
		subject s1 = new subject("Maths","Rajesh");
		subject s2 = new subject("English","Anuj");
		sub.add(s1);
		sub.add(s2);
				
		Student st = new Student("Name","1234",sub);
		System.out.println(st);
		
		JAXBContext context = JAXBContext.newInstance(Student.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	
		//m.marshal(st, System.out);
		
		
		StringWriter sw = new StringWriter();
		
		m.marshal(st, sw);
		String xmlOut = sw.toString();
		System.out.println(xmlOut);

	}

}
