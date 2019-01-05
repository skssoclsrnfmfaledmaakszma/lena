package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Janggen implements ActionListener {

	static JButton s, r, p;
	static JFrame f;


	public static void main(String[] args) {
		f = new JFrame();
		f.setTitle("가위바위보");

		f.setSize(700, 1000);
		f.setLocation(800, 0);

		s = new JButton();
		r = new JButton();
		p = new JButton();

		ImageIcon icon = new ImageIcon("s.png");
		ImageIcon icon2 = new ImageIcon("r.png");
		ImageIcon icon3 = new ImageIcon("p.png");

		s.setIcon(icon);
		r.setIcon(icon2);
		p.setIcon(icon3);

		s.addActionListener(new Janggen());
		r.addActionListener(new Janggen());
		p.addActionListener(new Janggen());

		FlowLayout flow = new FlowLayout();

		f.setLayout(flow);

		f.add(s);
		f.add(r);
		f.add(p);

		f.setVisible(true);
	


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random random = new Random();
		int alphago = random.nextInt(3);
		// 0 가위, 1바위, 2보
		 String alphagoString;
		if(alphago==0) {
			alphagoString = "가위";
		}else if(alphago==1) {
			alphagoString = "바위";
		}else {
			alphagoString = "보";			
		}
		
		
		System.out.println(alphagoString);

		if (e.getSource() == s) {// 내가 가위
			if (alphago == 0) {
				
				f.setTitle("비김, 컴퓨터 : " +alphagoString);
			} else if (alphago == 1) {
				f.setTitle("짐, 컴퓨터 : "+alphagoString );
			} else {
				f.setTitle("이김, 컴퓨터 : "+alphagoString );
			}

		} else if (e.getSource() == r) {
			if (alphago == 0) {
				f.setTitle("이김, 컴퓨터 : "+alphagoString );
			} else if (alphago == 1) {
				f.setTitle("비김, 컴퓨터 : "+alphagoString );
			} else {
				f.setTitle("짐, 컴퓨터 : "+alphagoString );
			}

		} else {
			if (alphago == 0) {
				f.setTitle("짐, 컴퓨터 : "+alphagoString );
			} else if (alphago == 1) {
				f.setTitle("이김, 컴퓨터 : "+alphagoString );
			} else {
				f.setTitle("비김, 컴퓨터 : "+alphagoString );
			}

		}

	}

}
