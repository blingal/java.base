
public class Shape {
	int area;
	int per;
	String color;
	 Shape(){
		 color="red";	
	}
	 public void getArea(int a,int b){
		 int area;
		 area=a*b;
	 }
	 public void getPer(int a,int b){
		 int per;
		 per=2*a+2*b;
	 }
	 public void showAll(){
		 System.out.println(""+area +""+per);
	 }

}
