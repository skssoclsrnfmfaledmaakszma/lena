package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
public class MyPicture2 implements ActionListener {

	static JButton confirmButton;
	static JButton cancelButton;
	static JLabel img;

	public static void main(String[] args) {

		JFrame jFrame = new JFrame();
		JLabel jLabel = new JLabel("alo, shuti");
		img = new JLabel();
		ImageIcon icon = new ImageIcon("alo.jpg");

		JLabel jLabelDetail = new JLabel(
				"��鼭 ���� ��, ������ �ֺϴ� ����Ƽ��?!..���� �ٻ� ����, ���������� �����Ȱ, ������� �ɸ� �Ƴ���������, �װ� �߷ɹ��� ���� ..");

		FlowLayout flow = new FlowLayout();

		jFrame.setTitle("France Movie");
		jFrame.setSize(800, 800);
		jFrame.setLocation(700, 200);

		confirmButton = new JButton("����");
		cancelButton = new JButton("����");

		MyPicture2 pic = new MyPicture2();
		confirmButton.addActionListener(pic);
		cancelButton.addActionListener(pic);

		jFrame.add(jLabel);
		jFrame.add(img);
		jFrame.add(jLabelDetail);
		jFrame.add(confirmButton);
		jFrame.add(cancelButton);

		jFrame.setLayout(flow);

		img.setIcon(icon);

		jFrame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(confirmButton)) {
			ImageIcon icon = new ImageIcon("wall-e.jpg");
			img.setIcon(icon);
		} else {
			ImageIcon icon = new ImageIcon("alo.jpg");		
			img.setIcon(icon);
		}
	}

}
*/