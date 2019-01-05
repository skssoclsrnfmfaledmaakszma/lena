package window;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Boston {

	public static void main(String[] args) {

		JFrame jf = new JFrame();
		
		jf.setSize(500,300);
		
		
		
		
		jf.setTitle("Boston");
		
		jf.setLocation(300, 300);
		
		JLabel jl = new JLabel();
		
		ImageIcon ii = new ImageIcon("kelly.jpg");
		
		jl.setIcon(ii);
		
		jf.add(jl);
		
		
		
		
		
		jf.setVisible(true);
	}

}
