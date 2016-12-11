package MyButton;
import java.awt.*; 
import java.awt.event.*;

//import ื๗าต.WindowCloser;

public class MyButton extends Frame implements ActionListener {
	Button redbtn;
	Button greenbtn;
	Button bluebtn;
	public static void main(String[] args) {
		MyButton sc=new MyButton("change");
		sc.setSize(300,300);
		sc.setVisible(true);
		sc.setLayout(new FlowLayout());
		WindowCloser w=new WindowCloser();
		sc.addWindowListener(w);
		// TODO Auto-generated method stub
	}
	public MyButton(String str){
		super(str);
		redbtn=new Button("Red");
		greenbtn=new Button("Green");   
		bluebtn=new Button("blue");
		add(redbtn);
		add(greenbtn);
		add(bluebtn);
		redbtn.addActionListener(this);
		greenbtn.addActionListener(this);
		bluebtn.addActionListener(this);
		
	} 
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==redbtn)
			setBackground(Color.red);
		if(e.getSource()==greenbtn)
			setBackground(Color.green);
		if(e.getSource()==bluebtn)
			setBackground(Color.blue);
		}
}
	class WindowCloser extends WindowAdapter{
		public void windowClosing(WindowEvent evt){
			System.exit(0);
		}
		
	}
