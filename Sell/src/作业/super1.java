package ื๗าต;

public class super1 {
	String name;
	void value(){
		name="China";
	}
}
class City extends super1{
	String name;
	void value(){
		name="tieling";
		super.value();
		System.out.println(name);
		System.out.println(super.name);
	}
}
