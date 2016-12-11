import java.util.Scanner;
public class Mark {
	public static void main(String args[]){
		double mark;
		System.out.println("请输入一个分数");
		Scanner sc=new Scanner(System.in);
		mark=sc.nextDouble();
		if(mark<0||mark>100)
			System.out.println("输入有误");
			//System.exit(0);
			else if(mark>=90)
				System.out.println("优秀");
			else if(mark>=80)
				System.out.println("良");
			else 
				System.out.println("lalalala");
		
	}
}
	

