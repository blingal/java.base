package ื๗าต;

public class Rectangle {
	private int length;
	private int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void getArea(){
		System.out.println(""+length*width);
		
		
		
	}
	public void getPer(){
		int num;
		num=2*width+2*length;
		System.out.println(""+num);
		
		
	}
	public void showAll(){
		
		
		
	}

	public Rectangle(int a,int b){
		length=a;
		width=b;
		  
		
	}
}
