import javax.swing.JFrame;
import javax.swing.*;

public class FrameDistance extends JFrame {


		public FrameDistance() {
			
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		add(panel);
		
		JLabel label1= new JLabel("거리를 입력하시외");
		panel.add(label1);
		JTextField field1 = new JTextField(10);
		panel.add(field1);
		
		JLabel label2= new JLabel("거리를 입력하시외");
		panel.add(label2);
		JTextField field2 = new JTextField(10);
		panel.add(field2);
		}
	}
