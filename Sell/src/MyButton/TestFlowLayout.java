package MyButton;
import java.awt.*;

public class TestFlowLayout {

	public static void main(String args[]) {
		Frame f=new Frame("布局管理器");
		f.setLayout(new FlowLayout());
		f.add(new Button("第一个"));
		f.add(new Button("第二个"));
		f.add(new Button("第三个"));
		f.setSize(300,300);
		f.setVisible(true);
		// TODO Auto-generated method stub

	}

}
