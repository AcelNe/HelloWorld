package ano_P;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassAnnoMain {

	public static void main(String[] args) {
		AbstractApplicationContext context= new AnnotationConfigApplicationContext(ClassAnno.class);
		
		System.out.println(context.getBean("member"));
		System.out.println(context.getBean("shm"));
		System.out.println(context.getBean("dubu"));
		System.out.println(context.getBean("bigPa"));
		System.out.println(context.getBean("dongTae"));
		System.out.println(context.getBean("kczg"));
		System.out.println(context.getBean("military"));
//		System.out.println(context.getBean("soyBean"));
		System.out.println(context.getBean("mm"));

	}

}
