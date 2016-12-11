
import java.util.Scanner;
 class nianfen {
	 public static void main(String args[]){
		 int year;
		 System.out.println("请输入年份");
		 Scanner sc=new Scanner(System.in);
		 year=sc.nextInt();
		 if(year<0||year>=3000){
			 System.out.println("年份有误，请重试");
			 //System.exit(0);
		 }
		 if((year%4==0)&&(year%100!=0))
			 System.out.println(year+"is 闰年");
		 else
			 System.out.println(year+"is 平年"); 
		 
	 }

}
 
 
 
 
 
 
 
 

