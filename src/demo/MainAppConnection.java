package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import demo.StudentTemplate;

public class MainAppConnection {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("MyXML.xml");

	      StudentTemplate studentTemplate = 
	         (StudentTemplate)context.getBean("studentTemplate");
	      
	      studentTemplate.create("Shivanjali", 19,"Gaikwad");
	      studentTemplate.create("Ayan", 14,"Gaikwad");
	      System.out.println("\n\n");
	      
	      Student student = studentTemplate.getStudent(19);
	      System.out.print("ID : " + student.getid() );
	      System.out.print("\nFirst Name : " + student.getFirstName() );
	      System.out.println("\nLast Name : " + student.getLastName());
	}
}
