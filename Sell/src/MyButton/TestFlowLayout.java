package MyButton;
import java.awt.*;

public class TestFlowLayout {

	public static void main(String args[]) {
		Frame f=new Frame("���ֹ�����");
		f.setLayout(new FlowLayout());
		f.add(new Button("��һ��"));
		f.add(new Button("�ڶ���"));
		f.add(new Button("������"));
		f.setSize(300,300);
		f.setVisible(true);
		// TODO Auto-generated method stub

	}

}
