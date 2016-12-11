import java.awt.*;
import javax.swing.*;
public class SwingDemo {
	public static void main(String[] args){
		SwingDemo sd=new SwingDemo();
	}
	SwingDemo(){
		JFrame f=new JFrame("SwingDemo");
		f.setVisible(true);
		f.setSize(200, 200);
		f.setLayout(new GridLayout(3,3));
		for(int i=1;i<=9;i++)
			f.add(new JButton(i+""));
	}

}
