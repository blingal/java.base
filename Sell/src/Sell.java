import java.util.Scanner;


 class A{
	 int price;
}
 public class Sell{
	 public static void main(String args[]){
		 A c=new A();
		 int a,b;
		 do{
			 System.out.println("美年达——4元------1");
			 System.out.println("七喜——4元--------2");
			 System.out.println("可乐——6元--------3");
			 System.out.println("果粒橙——5元-------4");
			 System.out.println("退出了呦----------5");
			 Scanner sc=new Scanner(System.in);
			 b=sc.nextInt();
			 switch(b){
			 case 1:System.out.println("您选择的商品是美年达，价格为4元");
			 c.price=4;break;
			 case 2:System.out.println("您选择的商品是七喜，价格为4元");
			 c.price=4;break;
			 case 3:System.out.println("您选择的商品是可乐，价格为6元");
			 c.price=6;break;
			 case 4:System.out.println("您选择的商品是果粒橙，价格为5元");
			 c.price=5;break;
			 case 5:System.out.println("再见吧再见吧再见吧");break;
			 }
			 if(b==5)break;
			 if(b>=1&&b<=4)
			 {
				 System.out.println("请输入您要支付的钱数：");
				 Scanner d=new Scanner(System.in);
				 int j=d.nextInt();
				 if(j>=c.price)
				 {
					 a=j-c.price;
					 System.out.println("小伙，找给你的钱数是"+a+"元");
				 }
				 else{
					 System.out.println("对不起，你钱够么？");
				 }
				 
			 }
			 
		 }while(b!=0);
		 
	 }
 }
