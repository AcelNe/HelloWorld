package ano_P.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Member {
	String pname;
	
	@Autowired
	int age;
	
	@Autowired
	Company com;
	
	public String getPname() {
		return pname;
	}
	@Autowired
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", age=" + age + ", com=" + com + "]";
	}
	
}
