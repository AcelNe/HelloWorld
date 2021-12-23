package ano_P;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceMain {

	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("anno_xml/required.xml");
		
		System.out.println(context.getBean("ww"));
	}

}
