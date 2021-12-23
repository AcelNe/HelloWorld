package aop_p.model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnoAdvice {
	
	@Pointcut("execution(boolean *..*(int, **))")
	void pointcccc() {
		
	}
	
	@Before("pointcccc()")
	void befffff(JoinPoint joinPoint) {
		System.out.println("JoinPoint befffff run()"+joinPoint.getSignature().toShortString());
	}
	
	@Before("execution(* aop_p.model.naver.SoundOfHeart.*(..))")
	void bef2(JoinPoint joinPoint) {
		System.out.println("bef2 run()"+joinPoint.getSignature().toShortString());
	}
	
	@Before("pointcccc() && execution(* aop_p.model.naver.SoundOfHeart.*(..))")
	void bef3(JoinPoint joinPoint) {
		System.out.println("bef3 run()"+joinPoint.getSignature().toShortString());
	}
	
	@AfterReturning(pointcut="poincccc()",returning = "rrr")
	void arRet(JoinPoint joinPoint, Object rrr) {
		System.out.println("arRet run()"+joinPoint.getSignature().toShortString()+" => "+rrr);
	}
	
	@AfterThrowing(pointcut="pointcccc()",throwing = "ee")
	void arThrow(JoinPoint joinPoint, Throwable ee) {
		System.out.println("arThrow run()"+joinPoint.getSignature().toShortString()+" => "+ee);
	}
	
	@After("pointcccc()")
	void aftt(JoinPoint joinPoint) {
		System.out.println("aftt run()"+joinPoint.getSignature().toShortString());
	}
}
