package window2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Pizza {

	JFrame f;
	JLabel top, count, price;
	JButton combo, gamza, gogi;
	JTextField num, total, list;
	
	int sum = 0;
	int comboNum = 0;
	int gamzaNum = 0;
	int gogiNum = 0;
	
	int priceSum =0;
	int comboPrice = 20000;
	int gamzaPrice = 18000;
	int gogiPrice = 19000;
	private JLabel lblAll;
	private JButton btnNewButton;
	
	
	
	
	public Pizza() {

		f = new JFrame();
		top = new JLabel("############### �ڹ����ڿ� ���� ���� ȯ���մϴ�. ###############");
		count = new JLabel("����");
		price = new JLabel("\uAC00\uACA9");
		combo = new JButton("�޺� ����");
		gamza = new JButton("������Ʈ ����");
		gogi = new JButton("�Ұ�� ����");
		num = new JTextField(25);
		total = new JTextField(25);
		list = new JTextField(25);

		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);

		f.getContentPane().add(top);
		f.getContentPane().add(combo);
		f.getContentPane().add(gamza);
		f.getContentPane().add(gogi);
		f.getContentPane().add(count);
		f.getContentPane().add(num);
		f.getContentPane().add(price);
		f.getContentPane().add(total);
		
		lblAll = new JLabel("\uCD1D\uACC4");
		f.getContentPane().add(lblAll);
		f.getContentPane().add(list);

		list.setForeground(Color.WHITE);
		list.setBackground(Color.DARK_GRAY);
		
		btnNewButton = new JButton("\uCD08\uAE30\uD654");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum = 0;
				priceSum =0;
				num.setText(sum+"");
				total.setText((priceSum)+"");
				list.setText("");
				
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		f.getContentPane().add(btnNewButton);

		combo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				num.setText(sum+"");
				priceSum = priceSum + comboPrice;
				total.setText((priceSum)+"");
				
				comboNum++;
				
				list.setText("�޺� : "+ comboNum + "��\n" + "�������� : "+ gamzaNum + "��\n"+"�Ұ�� : "+ gogiNum + "��\n");
				
				
			}
		});
		gamza.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				num.setText(sum+"");
				priceSum = priceSum + gamzaPrice;
				total.setText((priceSum)+"");
				
				gamzaNum++;
				
				list.setText("�޺� :"+ comboNum + "��\n" + "�������� :"+ gamzaNum + "��\n"+"�Ұ�� :"+ gogiNum + "��\n");
				
			}
		});
		gogi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				num.setText(sum+"");
				priceSum = priceSum + gogiPrice;
				total.setText((priceSum)+"");
				
				gogiNum++;
				
				list.setText("�޺� :"+ comboNum + "��\n" + "�������� :"+ gamzaNum + "��\n"+"�Ұ�� :"+ gogiNum + "��\n");
				
			}
		});

		f.setSize(340, 200);
		f.setLocation(600, 400);
		f.setVisible(true);

	}

	public static void main(String[] args) {

		Pizza pizza = new Pizza();

	}

}
