import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class 表格 extends JFrame {
	JTextField jf;
	JButton Dial,Cancel;

	public static void main(String[] args){
		
		JFrame f=new 表格("lalallalal");
		f.setSize(200, 220);
		f.setVisible(true);
	}
	
	public 表格(String title){
		super(title);
		String str[]={"1","2","3","4","5","6","7","8","9","0","*","#"};
		JButton btn[]=new JButton[str.length];
		jf=new JTextField(15);
		JPanel up=new JPanel();
		 up.add(jf);
		
		add("North",up);
		JPanel b=new JPanel();
		b.setLayout(new GridLayout(4,3,10,10));
		for(int i=0;i<12;i++){
			btn[i]=new JButton(str[i]);
			btn[i].addActionListener(new innerListner());
			b.add(btn[i]);
		}
		JPanel c=new JPanel();
		c.add(b);
		add("Center",c);
		 JPanel d=new JPanel(new FlowLayout());
		 Dial=new JButton("dial");
		 Cancel=new JButton("Cancel");
		 Dial.addActionListener(new innerListener());
		 Cancel.addActionListener(new innerListener2());
		 c.add(new Button("Dial"));
		    c.add(new Button("Cancel"));
		    add("South",c);
		 
		
		/*for(int i=1;i<=9;i++)
			b.add(new JButton(i+""));
		    b.add(new JButton("*"));
		    b.add(new JButton("0"));
		    b.add(new JButton("#"));
		    add("North",b);
		    
		   
		   
		    add("West",c);
		    add("East",d);	
		    for(int i=1;i<=9;i++){
	             btn[i].addActionListener(new innerListener());
		    }
		    
	jf=new JTextField(15);
	JPanel upPanel=new JPanel();
	upPanel.add(jf);
	add("North",upPanel);*/
		   
	
	class innerListener implements ActionListener{
		public void actionPerformed(ActionEvent evt){
			jf.setText(jf.getText()+evt.getActionCommand());
		}
	}
	class innerListener2 implements ActionListener{
		public void actionPerformed(ActionEvent evt){
			if(evt.getSource()==Dial)
				jf.setText("Calling");
			if(evt.getSource()==Cancel)
			{
				if(jf.getText().equals("Calling"))
					jf.setText("");
				else
				if(jf.getText().length()>0)
					jf.setText(jf.getText().substring(0, jf.getText().length()-1));
			}
		}
	}
	

}
}
