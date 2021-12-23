package ano_P;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ExamAnnoMain {

	public static void main(String[] args) {
		AbstractApplicationContext context= new AnnotationConfigApplicationContext(ExamConfig.class);
		System.out.println(context.getBean("exam"));
	}

}
