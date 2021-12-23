package di_P;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMain {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("di_xml/constructor.xml");
		
		System.out.println(context.getBean("mdb"));
		System.out.println(context.getBean("cc1"));
		
		System.out.println(context.getBean("cc2"));
		System.out.println(context.getBean("cc3"));
		System.out.println(context.getBean("cc4"));
		System.out.println(context.getBean("cc5"));
		System.out.println(context.getBean("cc6"));
		
		System.out.println(context.getBean("ach1"));
	}

}
