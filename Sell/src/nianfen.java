
import java.util.Scanner;
 class nianfen {
	 public static void main(String args[]){
		 int year;
		 System.out.println("���������");
		 Scanner sc=new Scanner(System.in);
		 year=sc.nextInt();
		 if(year<0||year>=3000){
			 System.out.println("�������������");
			 //System.exit(0);
		 }
		 if((year%4==0)&&(year%100!=0))
			 System.out.println(year+"is ����");
		 else
			 System.out.println(year+"is ƽ��"); 
		 
	 }

}
 
 
 
 
 
 
 
 

