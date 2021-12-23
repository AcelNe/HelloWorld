package di_P;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("di_xml/lifeCycle.xml");
		
		/*
		 * BeanFactoryPostProcessor 
		 * 각 생성자------------------------------------------- 인스턴스
		 * 각 property 설정(setter)---------------------------- 인스턴스
		 * bean의 setBeanName(dto) 실행------------------------ 인스턴스 <= BeanNameAware
		 * 각 bean의 MyBeanPostProcessor.postProcessBefore---- BeanPostProcessor
		 * 각 bean의            "       .postProcessAfter----- BeanPostProcessor
		 * bean의 afterPropertiesSet() 실행-------------------- 인스턴스 <= InitializingBean
		 * bean의 destory() 실행------------------------------- 인스턴스 <= DisposableBean
		 * */
		System.out.println(context.getBean("dto"));
	}
}
