package di_P;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
		System.out.println();
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{
		System.out.println();
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
