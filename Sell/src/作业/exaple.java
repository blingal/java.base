package ×÷Òµ;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class exaple {

	public static void main(String[] args) {
		
		Frame f=new Frame("ºÚ°×¸ñ");
		Button btn[][]=new Button[12][12];
		f.setLayout(new GridLayout(12,12));
		WindowCloser w=new WindowCloser();
		f.addWindowListener(w);
		for(int i=0;i<12;i++){
			for(int j=0;j<12;j++)
			{
				btn[i][j]=new Button();
				f.add(btn[i][j]);
				if((i+j)%2==0)
					btn[i][j].setBackground(Color.BLACK);
				else
					btn[i][j].setBackground(Color.WHITE);
			}
		}
		f.setSize(400,400);
		f.setVisible(true);
		// TODO Auto-generated method stub

	}
}
	class WindowCloser extends WindowAdapter{
		public void windowClosing(WindowEvent evt){
			System.exit(0);
		}

}
