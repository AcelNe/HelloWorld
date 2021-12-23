package di_P.model;

import java.util.List;

public class StudBan {
	int ban;
	List<Stud> studs;
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public List<Stud> getStuds() {
		return studs;
	}
	public void setStuds(List<Stud> studs) {
		this.studs = studs;
	}
	
	@Override
	public String toString() {
		String res="["+ban+"반]\n";
		for(Stud stud:studs) {
			res+=stud.toString()+"\n";
		}
		return res;
	}
}
