package ano_P.model;

import java.util.Set;
import java.util.TreeSet;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Exam {
	
	TreeSet<Stud> ts;
	
	@Resource
	public void setTTT(Set<Stud> studs) {
		ts=new TreeSet<>(studs);
		calc();
	}
	
	@Resource
	public void setStuds(Stud[] studs) {
		ts=new TreeSet<>();
		for(Stud stud:studs) {
			ts.add(stud);
		}
		calc();
	}
	
	public void calc() {
		for(Stud stud: ts) {
			stud.rankCalc(ts);
		}
	}

	@Override
	public String toString() {
		String res="";
		for(Stud stud:ts) {
			res=stud+"\n";
		}
		return res;
	}
	
}
