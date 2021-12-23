package ano_P.model;

import java.util.Arrays;
import java.util.TreeSet;

import lombok.Data;

@Data
public class Stud implements Comparable<Stud>{
	String name;
	int[]jum;
	int tot, avg, rank;
	
	public Stud(String name, int... jum) {
		super();
		this.name = name;
		this.jum = jum;
		
		calc();
	}
	
	void calc() {
		tot=0;
		for(int i:jum) {
			tot+=i;
		}
		avg=tot/jum.length;
	}
	
	void rankCalc(TreeSet<Stud> ts) {
		rank=1;
		for(Stud stud:ts) {
			if(avg<stud.avg) {
				rank++;
			}
		}
	}
	
	@Override
	public int compareTo(Stud stud) {
		int res=stud.avg-avg;
		if(res==0) {
			res=name.compareTo(stud.name);
		}
		return res;
	}

	@Override
	public String toString() {
		return "Stud [name=" + name + ", jum=" + Arrays.toString(jum) + ", tot=" + tot + ", avg=" + avg + ", rank="
				+ rank + "]";
	}
}
