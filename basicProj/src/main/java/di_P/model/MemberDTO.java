package di_P.model;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MemberDTO implements BeanNameAware, InitializingBean, DisposableBean{
	String pname;
	int age;
	
	School sch;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
		System.out.println("MemberDTO.setPname"+pname+"실행");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public School getSch() {
		return sch;
	}

	public void setSch(School sch) {
		this.sch = sch;
	}

	@Override
	public String toString() {
		return "MemberDTO [pname=" + pname + ", age=" + age + ", sch=" + sch + "]";
	}

	public MemberDTO() {
		System.out.println("MemberDTO 기본생성사");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MemberDTO.destroy() 실행---");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MemberDTO.afterPropertiesSet() 실행---");
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("MemberDTO.setBeanName() 실행---");
	}
	
	
}

class School{
	String name, addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", addr=" + addr + "]";
	}

	public School() {
		System.out.println("School 기본생성자");
	}
	
}