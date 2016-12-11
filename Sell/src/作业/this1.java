package ื๗าต;

public class this1 {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	this1(String name,int age){
		setName(name);
		setAge(age);
		this.print();
	}
		
		public void print(){
			System.out.println("Name="+name+" Age="+age);
		}
		public static void main(String []args){
			this1 dt=new this1("lalala",22);
			
		}
	}


