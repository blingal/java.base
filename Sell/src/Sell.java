import java.util.Scanner;


 class A{
	 int price;
}
 public class Sell{
	 public static void main(String args[]){
		 A c=new A();
		 int a,b;
		 do{
			 System.out.println("������4Ԫ------1");
			 System.out.println("��ϲ����4Ԫ--------2");
			 System.out.println("���֡���6Ԫ--------3");
			 System.out.println("�����ȡ���5Ԫ-------4");
			 System.out.println("�˳�����----------5");
			 Scanner sc=new Scanner(System.in);
			 b=sc.nextInt();
			 switch(b){
			 case 1:System.out.println("��ѡ�����Ʒ�������۸�Ϊ4Ԫ");
			 c.price=4;break;
			 case 2:System.out.println("��ѡ�����Ʒ����ϲ���۸�Ϊ4Ԫ");
			 c.price=4;break;
			 case 3:System.out.println("��ѡ�����Ʒ�ǿ��֣��۸�Ϊ6Ԫ");
			 c.price=6;break;
			 case 4:System.out.println("��ѡ�����Ʒ�ǹ����ȣ��۸�Ϊ5Ԫ");
			 c.price=5;break;
			 case 5:System.out.println("�ټ����ټ����ټ���");break;
			 }
			 if(b==5)break;
			 if(b>=1&&b<=4)
			 {
				 System.out.println("��������Ҫ֧����Ǯ����");
				 Scanner d=new Scanner(System.in);
				 int j=d.nextInt();
				 if(j>=c.price)
				 {
					 a=j-c.price;
					 System.out.println("С��Ҹ����Ǯ����"+a+"Ԫ");
				 }
				 else{
					 System.out.println("�Բ�����Ǯ��ô��");
				 }
				 
			 }
			 
		 }while(b!=0);
		 
	 }
 }
