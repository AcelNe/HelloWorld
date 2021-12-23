package di_P;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_P.model.Member;
import di_P.model.Stud;

//src/main/java - java 파일 
//src/main/resources - xml 파일

//1. Member.java 생성
//2. 한번 출력해봄
//3. xml 생성 (구조화된 문서 라이크 html)
//4. context 생성
//5. member를 context로 생성
//6. 오류나는 경우 확인
//7. xml 에 xmlns:p="http://www.springframework.org/p" 추가 (property 간편화)
//8. context.getBeanDefinitionNames()
//9. Stud.java baby.java 생성   public 아니여도 불러오기 가능
//10. 문자열로 객체 선택가능
//11. Phone.java 생성

public class DiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member mm1 = new Member("오병철");
		mm1.setName("하성민");
		mm1.setAge(26);
		
		System.out.println(mm1);
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("di_xml/first.xml");
		//member 기본생성자 실행 : 미리 만들어 놓고 부르는거
		//setName(String name) 실행
		//setAge(int age) 실행
		// 1. 그래서 기본생성자가 정의되어있지 않으면 오류
		
		Member mb2 = (Member)context.getBean("mm2");
		
		System.out.println(mb2);
		System.out.println(context.getBean("mm3"));
		
		String[] names = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(names));
	
		Member mb3 = context.getBean("mm3", Member.class); // 형변환 다른 방법으로 함
		System.out.println(mb3.getName());
		Member [] arr1 = {
				context.getBean("mm2",Member.class),
				context.getBean("mm3",Member.class),
				context.getBean("st4",Member.class),
				context.getBean("bb5",Member.class)
		};
		System.out.println("arr1----------------------");
		for (Member mem : arr1) {
			System.out.println(mem);
		}
		
		Member mmm1 = new Stud();
		//Member mmm2 = new Baby(); baby는 퍼블릭이 아니라 패키지가 달라서 에러
		// 근데 bean으로는 가져옴
		
		System.out.println("arr2----------------------");
		ArrayList<Member> arr2 = new ArrayList();
		
		
		for(String str : "mm2,mm3,st4,bb5".split(",")) {
			arr2.add(context.getBean(str,Member.class));
		}
		for (Member mem : arr2) {
			System.out.println(mem);
		}
		
		
	}

}
