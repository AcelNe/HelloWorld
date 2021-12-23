package aop_p.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Member {
	String pname="오병철";
	int age=23, cnt=0;
}
