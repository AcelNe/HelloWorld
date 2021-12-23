package ano_P;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import ano_P.model.Stud;

@ComponentScan("ano_P.model")
public class ExamConfig {
	@Bean
	Stud st1() {
		Stud res=new Stud("사람1",7,8,2);
		return res;
	}
	
	@Bean
	Stud st2() {
		Stud res=new Stud("사람2",7,8,2);
		return res;
	}
	
	@Bean
	Stud st3() {
		Stud res=new Stud("사람3",7,8,2);
		return res;
	}
	
	@Bean
	Stud st4() {
		Stud res=new Stud("사람4",7,8,2);
		return res;
	}
	
	@Bean
	Stud st5() {
		Stud res=new Stud("사람5",7,8,2);
		return res;
	}
}
