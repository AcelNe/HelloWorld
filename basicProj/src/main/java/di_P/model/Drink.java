package di_P.model;

import java.util.Arrays;
import java.util.List;

public class Drink {
	Alcohol aa;
	String name;
	int price;
	List<Alcohol>[] arr;
	
	public Drink(String name, Alcohol aa, int price) {
		System.out.println("생성장:name-"+name+", aa-"+aa+", price-"+price);
		this.name=name;
		this.aa=aa;
		this.price=price;
	}
	
	public Drink(String name, int price, List<Alcohol>[] arr) {
		super();
		System.out.println("생성자:name-"+name+", arr-"+Arrays.toString(arr)+", price-"+price);
		this.name = name;
		this.price = price;
		this.arr = arr;
	}

	public Drink(String name, int price, String...ttt) {
		super();
		System.out.println("생성자:name-"+name+", price-"+price+", ttt-"+Arrays.toString(ttt));
		this.name = name;
		this.price = price;
	}

	public Drink() {
		System.out.println("기본생성자");
	}
	
	public Drink(String name) {
		System.out.println("생성자:name-"+name);
		this.name=name;
	}

	public Alcohol getAa() {
		return aa;
	}

	public void setAa(Alcohol aa) {
		this.aa = aa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Drink [aa=" + aa + ", name=" + name + ", price=" + price + ", arr="+Arrays.toString(arr)+"]";
	}
	
}

class Alcohol{
	String name;
	int proof;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProof() {
		return proof;
	}
	public void setProof(int proof) {
		this.proof = proof;
	}
	@Override
	public String toString() {
		return "Alcholo [name=" + name + ", proof=" + proof + "]";
	}
}
