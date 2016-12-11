package 作业;
import java.util.Scanner;
public class 冒泡 {
	public static void paixu(){
		int[]a={4,7,8,6,9,2,45,2};
		
		
		for(int i=0;i<a.length-1;i++)
			for(int j=i;j<a.length;j++){
				if(a[i]>a[j]){
					int c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		System.out.println("见证奇迹");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int[]a={4,7,8,6,9,2,45,2};
		paixu();
		
		
		
		
		// TODO Auto-generated method stub
		

	}

}
