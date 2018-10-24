package demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("MyXML.xml");
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      System.out.println(obj.hashCode());
	      HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
	      
	      System.out.println(obj1.gethelloWord());
	   }
}
