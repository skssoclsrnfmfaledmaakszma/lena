package window;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/*
public class MyCalculation implements ActionListener {

	static JLabel l1, l2, result;
	static JTextField t1, t2;
	static JButton plus, minus, multiple, division;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Cal");

		f.setSize(300, 250);
		f.setLocation(700, 400);

		l1 = new JLabel("¼ö1 : ");
		l2 = new JLabel("¼ö2 : ");
		result = new JLabel(" - ");
		Font font = new Font("¸¼Àº°íµñ", Font.BOLD, 80);
		result.setFont(font);

		t1 = new JTextField(7);
		t2 = new JTextField(7);

		plus = new JButton("   +   ");
		minus = new JButton("   -   ");
		multiple = new JButton("   *   ");
		division = new JButton("   /   ");
		
		plus.setForeground(Color.RED);
		plus.setBackground(Color.BLACK);
		minus.setForeground(Color.RED);
		minus.setBackground(Color.BLACK);
		multiple.setForeground(Color.RED);
		multiple.setBackground(Color.BLACK);
		division.setForeground(Color.RED);
		division.setBackground(Color.BLACK);
		

		MyCalculation cal = new MyCalculation();
		plus.addActionListener(cal);
		minus.addActionListener(cal);
		multiple.addActionListener(cal);
		division.addActionListener(cal);

		f.add(l1);
		f.add(t1);

		f.add(l2);
		f.add(t2);

		f.add(plus);
		f.add(minus);
		f.add(multiple);
		f.add(division);
		f.add(result);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String i = t1.getText();
		int iNum = Integer.parseInt(i);

		String j = t2.getText();
		int jNum = Integer.parseInt(j);

		if (e.getSource() == plus) {
			result.setText((iNum + jNum) + "");
		} else if (e.getSource() == minus) {
			result.setText((iNum - jNum) + "");
		} else if (e.getSource() == multiple) {
			result.setText((iNum * jNum) + "");
		} else if (e.getSource() == division) {
			result.setText((iNum / jNum) + "");
		} else {
			System.out.println("");
		}
	}

}*/
