import java.awt.*;
import javax.swing.*;



import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {

    public Calculator() {
        setTitle("계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 5)); // 행.열

        JTextField field = new JTextField(); //계산기 입력부분
        
        add(field);
        add(new JButton("Backspace")); // 버튼 생성
        add(new JButton(""));
        add(new JButton(""));
        add(new JButton("CE"));
        add(new JButton("C"));
        add(new JButton("7"));
        add(new JButton("8"));
        add(new JButton("9"));
        add(new JButton("/"));
        add(new JButton("sqrt"));
        add(new JButton("4"));
        add(new JButton("5"));
        add(new JButton("6"));
        add(new JButton("X"));
        add(new JButton("%"));
        add(new JButton("1"));
        add(new JButton("2"));
        add(new JButton("3"));
        add(new JButton("-"));
        add(new JButton("1/x"));
        add(new JButton("0"));
        add(new JButton("+/-"));
        add(new JButton("."));
        add(new JButton("+"));
        add(new JButton("="));

        setSize(400, 400); // Set the window size
        setVisible(true); // Make the window visible
    }

    public static void main(String[] args) {
        new Calculator(); // Create and show the calculator
    }
}



/*
public class Calculator extends JFrame{
	
	
	public Calculator() {
		
		public static void main(String[] args) {
			
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(5,5)); //행.열
		
		add(new JButton("Backspace")); //버튼 생성
		add(new JButton("Backspace"));
		add(new JButton(""));
		add(new JButton(""));
		add(new JButton("CE"));
		add(new JButton("C"));
		add(new JButton("7"));
		add(new JButton("8"));
		add(new JButton("9"));
		add(new JButton("/"));
		add(new JButton("sqrt"));
		add(new JButton("4"));
		add(new JButton("5"));
		add(new JButton("6"));
		add(new JButton("X"));
		add(new JButton("%"));
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("-"));
		add(new JButton("1/x"));
		add(new JButton("0"));
		add(new JButton("+/-"));
		add(new JButton("."));
		add(new JButton("+"));
		add(new JButton("="));
		}
	}
	
	
}
*/



/*
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();
		JPanel panel = new JPanel();
		
		f.add(panel);
		
		JTextField field = new JTextField(); //계산기 입력부분
		
		panel.setLayout(new GridLayout()); //계산기틀인 그리드레이아웃 생성
		
		f.setSize(600, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("계산기");
		f.setVisible(true);
	
		

	}

}
*/
