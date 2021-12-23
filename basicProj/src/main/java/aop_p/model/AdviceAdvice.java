package aop_p.model;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AdviceAdvice {
	
//	Object befffff(ProceedingJoinPoint joinPoint) {
//		Object res=null;
//		System.out.println("befffff run()");
//		return res;
//	}
	
	void befffff(JoinPoint joinPoint) {
		System.out.println("JoinPoint befffff run()"+joinPoint.getSignature().toShortString());
	}
	
	void arRet(JoinPoint joinPoint, Object rrr) {
		System.out.println("arRet run()"+joinPoint.getSignature().toShortString()+" => "+rrr);
	}
	
	void arThrow(JoinPoint joinPoint, Throwable ee) {
		System.out.println("arThrow run()"+joinPoint.getSignature().toShortString()+" => "+ee);
	}
	
	void aftt(JoinPoint joinPoint) {
		System.out.println("aftt run()"+joinPoint.getSignature().toShortString());
	}
}
