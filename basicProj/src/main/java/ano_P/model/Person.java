package ano_P.model;

import org.springframework.beans.factory.annotation.Required;

public class Person {
	String pname;
	int age;
	Company con;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Company getCon() {
		return con;
	}
	public void setCon(Company con) {
		this.con = con;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", age=" + age + ", con=" + con + "]";
	}
	
}

class Company{
	String title, addr;

	public String getTitle() {
		return title;
	}
	
	@Required//required는 반드시 setter에 설정
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Company [title=" + title + ", addr=" + addr + "]";
	}
	
	
}