package aop_p.model.naver;

import org.springframework.stereotype.Component;

@Component
public class FashionKing {
	public String gian() {
		System.out.println("패션왕 gian() run");
		
		return "기안84";
	}
	
	public boolean marriage() {
		System.out.println("패션왕 marriage() run");
		
		return false;
	}
	
	public void changJu() {
		System.out.println("패션왕 chang() run");
	}
}
