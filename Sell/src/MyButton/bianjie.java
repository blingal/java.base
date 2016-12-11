package MyButton;
import java.awt.*;

public class bianjie {
	public static void main(String args[]){
		
	Frame f=new Frame("边界");
	f.setLayout(new BorderLayout());
	f.add("North",new Button("第一个"));
	f.add("West",new Button("第二个"));
	f.setSize(300,300);
	f.setVisible(true);
	}

}
