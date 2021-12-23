package di_P.model;

public class Member {
	
	String name;
	int age;
	boolean marriage;
	
	Company com;
	
	
	public boolean isMarriage() {
		return marriage;
	}
	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}
	public Company getCom() {
		return com;
	}
	public void setCom(Company com) {
		this.com = com;
	}
	
	public Member() {
		System.out.println("member 기본생성자 실행");
	}
	public Member(String name) {
		super();
		this.name = name;
		System.out.println("member 사용자 정의 생성자 실행");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("setName(String name) 실행");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println("setAge(int age) 실행");
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", marriage=" + marriage + ", com=" + com + "]";
	}
	
	
}

class Company{
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
		return "Company [name=" + name + ", addr=" + addr + "]";
	}
	
}
