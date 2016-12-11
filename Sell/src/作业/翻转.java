package 作业;
import java.util.Scanner;

public class 翻转 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入数字吧");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a!=0){
			int b=a%10;
			System.out.print(b);
			a=a/10;
			
		}

	}

}
