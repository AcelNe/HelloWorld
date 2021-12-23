package di_P.model;

public class Server {
	String name;
	Bonche bb;
	Monitor mm1, mm2;
	KeyBoard kk;
	Mouse ms;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bonche getBb() {
		return bb;
	}
	public void setBb(Bonche bb) {
		this.bb = bb;
	}
	public Monitor getMm1() {
		return mm1;
	}
	public void setMm1(Monitor mm1) {
		this.mm1 = mm1;
	}
	public Monitor getMm2() {
		return mm2;
	}
	public void setMm2(Monitor mm2) {
		this.mm2 = mm2;
	}
	public KeyBoard getKk() {
		return kk;
	}
	public void setKk(KeyBoard kk) {
		this.kk = kk;
	}
	public Mouse getMs() {
		return ms;
	}
	public void setMs(Mouse ms) {
		this.ms = ms;
	}
	@Override
	public String toString() {
		return "Server [name=" + name + ", bb=" + bb + ", mm1=" + mm1 + ", mm2=" + mm2 + ", kk=" + kk + ", ms=" + ms
				+ "]";
	}
}

class DeskTop {
	String name;
	Bonche bb;
	Monitor mm1;
	KeyBoardChild kk;
	MouseChild ms;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bonche getBb() {
		return bb;
	}
	public void setBb(Bonche bb) {
		this.bb = bb;
	}
	public Monitor getMm() {
		return mm1;
	}
	public void setMm(Monitor mm1) {
		this.mm1 = mm1;
	}
	public KeyBoard getKk() {
		return kk;
	}
	public void setKk(KeyBoardChild kk) {
		this.kk = kk;
	}
	public Mouse getMs() {
		return ms;
	}
	public void setMs(MouseChild ms) {
		this.ms = ms;
	}
	@Override
	public String toString() {
		return "DeskTop [name=" + name + ", bb=" + bb + ", mm=" + mm1 + ", kk=" + kk + ", ms=" + ms + "]";
	}
}

class NoteBook{
	String name;
	Bonche bb1;
	Mouse ms3;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bonche getBb() {
		return bb1;
	}
	public void setBb(Bonche bb) {
		this.bb1 = bb;
	}
	public Mouse getMs() {
		return ms3;
	}
	public void setMs(Mouse ms) {
		this.ms3 = ms;
	}
	@Override
	public String toString() {
		return "NoteBook [name=" + name + ", bb=" + bb1 + ", ms=" + ms3 + "]";
	}
}

class Tablet{
	String name;
	BoncheChilde bb;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bonche getBb() {
		return bb;
	}
	public void setBb(BoncheChilde bb) {
		this.bb = bb;
	}
	@Override
	public String toString() {
		return "Tablet [name=" + name + ", bb=" + bb + "]";
	}
}


class Bonche{
	String cpu, hdd;
	int ram;
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Bonche [cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + "]";
	}
}

class BoncheChilde extends Bonche{
	
}

class Monitor{
	String kind;
	int size;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Monitor [kind=" + kind + ", size=" + size + "]";
	}
}

class KeyBoard{
	String type;
	int price;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "KeyBoard [type=" + type + ", price=" + price + "]";
	}
}

class KeyBoardChild extends KeyBoard{
	
}

class Mouse{
	String type;
	boolean wireless;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isWireless() {
		return wireless;
	}
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	@Override
	public String toString() {
		return "Mouse [type=" + type + ", wireless=" + wireless + "]";
	}
}

class MouseChild extends Mouse{
	
}
