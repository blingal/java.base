package MyButton;
import java.awt.*;

public class bianjie {
	public static void main(String args[]){
		
	Frame f=new Frame("�߽�");
	f.setLayout(new BorderLayout());
	f.add("North",new Button("��һ��"));
	f.add("West",new Button("�ڶ���"));
	f.setSize(300,300);
	f.setVisible(true);
	}

}
