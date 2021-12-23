package aop_p.model.daum;

import org.springframework.stereotype.Component;

@Component
public class FatherSup{
	public void meth_1(){
		System.out.println("Fathersup meth_1() run");
	}
	
	public String meth_2(int aa, boolean bb){
		System.out.println("Fathersup meth_2() run: "+aa+", "+bb);
		return "아기상어";
	}
}