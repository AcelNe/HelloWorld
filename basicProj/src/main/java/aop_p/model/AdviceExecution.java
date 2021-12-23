package aop_p.model;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AdviceExecution {
	Object retStr(ProceedingJoinPoint joinPoint) {
		Object res=null;
		System.out.println("retStr() run: "+joinPoint.getSignature().toShortString());
		try {
			res=joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return res;
	}
	
	Object retBool(ProceedingJoinPoint joinPoint) {
		Object res=null;
		System.out.println("retBool() run: "+joinPoint.getSignature().toShortString());
		try {
			res=joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return res;
	}
	
	Object argIntplus(ProceedingJoinPoint joinPoint) {
		Object res=null;
		System.out.println("argIntplus() run: "+joinPoint.getSignature().toShortString());
		try {
			res=joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return res;
	}
	
	Object argZero(ProceedingJoinPoint joinPoint) {
		Object res=null;
		System.out.println("argZero() run: "+joinPoint.getSignature().toShortString());
		try {
			res=joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return res;
	}
	
	Object methStartM(ProceedingJoinPoint joinPoint) {
		Object res=null;
		System.out.println("methStartM() run: "+joinPoint.getSignature().toShortString());
		try {
			res=joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return res;
	}
	
	Object clalssStartF(ProceedingJoinPoint joinPoint) {
		Object res=null;
		System.out.println("clalssStartF() run: "+joinPoint.getSignature().toShortString());
		try {
			res=joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return res;
	}
	
	Object pacStart_n(ProceedingJoinPoint joinPoint) {
		Object res=null;
		System.out.println("pacStart_n() run: "+joinPoint.getSignature().toShortString());
		try {
			res=joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return res;
	}
}
