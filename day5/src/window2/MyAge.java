package window2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyAge {

	JFrame f;
	JLabel top, name, year, age, result;
	JButton confirm;
	JTextField n, y, a;

	public MyAge() {
		f = new JFrame();
//		top = new JLabel("성인인증 프로그램");
		name = new JLabel("이름");
		year = new JLabel("생년");
		age = new JLabel(" 나이");
		result = new JLabel();
		confirm = new JButton("인증");
		n = new JTextField(20);
		y = new JTextField(20);
		a = new JTextField(3);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		f.setTitle("성인인증 프로그램");

		f.add(name);
		f.add(n);
		f.add(year);
		f.add(y);
		f.add(confirm);
		
		f.add(age);
		f.add(a);

		f.add(result);
		age.setForeground(Color.RED);
		result.setForeground(Color.BLUE);
		
		confirm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = n.getText();
				String year = y.getText();

				int yearInt = Integer.parseInt(year);
				int ageResult = 2019 - yearInt + 1;
				a.setText(ageResult + "");

				if (ageResult > 19) {
					result.setText(name + ": 성인");
				} else {
					result.setText(name + ": 미성년자");
				}
			}
		});

		f.setSize(300, 200);
		f.setLocation(600, 400);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		MyAge age = new MyAge();

	}

}
