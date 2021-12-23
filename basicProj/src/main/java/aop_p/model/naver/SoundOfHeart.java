package aop_p.model.naver;

import org.springframework.stereotype.Component;

@Component
public class SoundOfHeart{
	public String josuk() {
		System.out.println("josuk 실행()");
		return "조석";
	}
	public Integer ironKing() {
		System.out.println("조철왕 실행()");
		return 1234;
	}
	public boolean aebong(int a, double d) {
		System.out.println("aebong run()"+a+", "+d);
		return true;
	}
	public boolean flower(int a) {
		System.out.println("flower run()"+a);
		return true;
	}
	public boolean err() {
		System.out.println("err run()");
		int a=10/2;
		return false;
	}
}

