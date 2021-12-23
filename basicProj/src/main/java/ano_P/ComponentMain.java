package ano_P;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentMain {

	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("anno_xml/component.xml");
		
		System.out.println(context.getBean("member"));
//		System.out.println(context.getBean("masuri"));
		System.out.println(context.getBean("hsm"));
		
	}

}
