import java.util.Scanner;
public class Mark {
	public static void main(String args[]){
		double mark;
		System.out.println("������һ������");
		Scanner sc=new Scanner(System.in);
		mark=sc.nextDouble();
		if(mark<0||mark>100)
			System.out.println("��������");
			//System.exit(0);
			else if(mark>=90)
				System.out.println("����");
			else if(mark>=80)
				System.out.println("��");
			else 
				System.out.println("lalalala");
		
	}
}
	

