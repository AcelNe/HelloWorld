package di_P;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_P.model.Phone;
import di_P.model.Stud;
import di_P.model.StudBan;

public class CollectionMain {

	public static void main(String[] args) {
		AbstractApplicationContext context=
				new ClassPathXmlApplicationContext("di_xml/collection.xml");
		Stud st1=context.getBean("st1",Stud.class);
		
		System.out.println(st1);
		System.out.println(context.getBean("st2",Stud.class));
		System.out.println(context.getBean("ph1",Phone.class));
		System.out.println(context.getBean("ban",StudBan.class));
	}
}
