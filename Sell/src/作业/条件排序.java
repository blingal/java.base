package ��ҵ;
import java.util.*;

public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a");
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		System.out.println("b");
		Scanner y=new Scanner(System.in);
		int b=y.nextInt();
		System.out.println("c");
		Scanner z=new Scanner(System.in);
		int c=z.nextInt();
		�������� e=new ��������();
		e.sort(a,b,c);
		
	}
	public void sort(int a,int b, int c){
		int temp=0;
		if(a>b){
			temp=a;a=b;b=temp;
		}
		if(a>c){
			temp=a;a=c;c=temp;
		}
		if(b>c){
			temp=b;b=c;c=temp;
		}
		System.out.println(a+","+b+","+c);
		
	}

}
