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
	
	
	
	
	public Pizza() {

		f = new JFrame();
		top = new JLabel("############### 자바피자에 오신 것을 환영합니다. ###############");
		count = new JLabel("갯수");
		price = new JLabel("            가격");
		combo = new JButton("콤보 피자");
		gamza = new JButton("포테이트 피자");
		gogi = new JButton("불고기 피자");
		num = new JTextField(20);
		total = new JTextField(20);
		list = new JTextField(25);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		f.add(top);
		f.add(combo);
		f.add(gamza);
		f.add(gogi);
		f.add(count);
		f.add(num);
		f.add(price);
		f.add(total);
		f.add(list);

		list.setForeground(Color.WHITE);
		list.setBackground(Color.DARK_GRAY);

		combo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				num.setText(sum+"");
				priceSum = priceSum + comboPrice;
				total.setText((priceSum)+"");
				
				comboNum++;
				
				list.setText("콤보 : "+ comboNum + "개\n" + "포테이토 : "+ gamzaNum + "개\n"+"불고기 : "+ gogiNum + "개\n");
				
				
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
				
				list.setText("콤보 :"+ comboNum + "개\n" + "포테이토 :"+ gamzaNum + "개\n"+"불고기 :"+ gogiNum + "개\n");
				
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
				
				list.setText("콤보 :"+ comboNum + "개\n" + "포테이토 :"+ gamzaNum + "개\n"+"불고기 :"+ gogiNum + "개\n");
				
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
