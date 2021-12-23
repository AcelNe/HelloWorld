package di_P.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stud extends Member {

	String kind;
	int[]jum;
	int tot,avg;
	
	List<Integer>jum2;
	Set<Integer>jum3;
	Map<String,Integer>jum4;

	public List<Integer> getJum2() {
		return jum2;
	}

	public void setJum2(List<Integer> jum2) {
		this.jum2 = jum2;
	}

	public Set<Integer> getJum3() {
		return jum3;
	}

	public void setJum3(Set<Integer> jum3) {
		this.jum3 = jum3;
	}

	public Map<String, Integer> getJum4() {
		return jum4;
	}

	public void setJum4(Map<String, Integer> jum4) {
		this.jum4 = jum4;
	}

	public int[] getJum() {
		return jum;
	}

	public void setJum(int[] jum) {
		this.jum = jum;
//		tot=0;
//		for(int i:jum) {
//			tot+=i;
//		}
//		avg=tot/jum.length;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Stud [kind=" + kind + ", jum=" + Arrays.toString(jum) + ", tot=" + tot + ", avg=" + avg + ", jum2="
				+ jum2 + ", jum3=" + jum3 + ", jum4=" + jum4 + "]";
	}
	
}

class Baby extends Member {
	
	String toy;

	public String getToy() {
		return toy;
	}

	public void setToy(String toy) {
		this.toy = toy;
	}

	@Override
	public String toString() {
		return "Baby [toy=" + toy + ", name=" + name + ", age=" + age + ", marriage=" + marriage + "]";
	}
	
	
}
