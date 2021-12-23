package aop_p.model;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AdviceDaum{
	
	Object adad(ProceedingJoinPoint joinPoint) {
		System.out.println("adad run()"+joinPoint.getSignature().getName());
		Object res=null;
		
		return res;
	}
}