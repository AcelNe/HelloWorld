package aop_p.model;

import java.util.Arrays;

import javax.annotation.Resource;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AdviceNaver{
	
	@Resource
	Member mem;
	
	Object sohGoGo(ProceedingJoinPoint joinPoint) {
		System.out.println("sohGoGo run():"+joinPoint.getSignature().getName());
		System.out.println("sohGoGo 미개변수():"+Arrays.toString(joinPoint.getArgs()));
		Object res=null;
		try {
			res=joinPoint.proceed();
			if(res instanceof String && res.equals("조석")) {
//				System.out.println("이거 문자열");
				res="센세이션";
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
}