package di_P;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 1. 객체 안에 객체 property 정하는법
// 2. <bean name ="gal" class = "di_P.model.Phone" p:fc-ref="cam1"> 혹은 <property><ref bean="cam1"/>

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("di_xml/second.xml");
		
		System.out.println(context.getBean("gal"));
		System.out.println(context.getBean("adult"));
	}

}



