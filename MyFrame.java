import javax.swing.*;
import java.awt.*; //*은 모든 형식을 나타낸다.
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MyFrame extends JFrame {
	
	
		private JButton button2;
		private JLabel label1;
		private int count = 0;
		
		public MyFrame(String title) {
			
			Toolkit kit = Toolkit.getDefaultToolkit();
			Dimension screenSize = kit.getScreenSize();
			
			
			setSize(300,200);
			setLocation(screenSize.width/2 - 300/2 ,screenSize.height/2 - 200/2);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("MyFrame");
			//Image img = kit.getImage("icon.gif);
			//setIconImage(img);
			setLayout(new BorderLayout());
			//JButton button = new JButton("button");
			//this.daa(button);
			setVisible(true);
			
			
			setLayout(new FlowLayout());
			
			JButton button = new JButton("버튼");
			JButton button2 = new JButton("버튼2");
			JButton button3 = new JButton("버튼3");
			
			//화실표 부분부터 다시 듣기
			
			Panel panel1 = new Panel();
			Panel panel2 = new Panel();
			this.add(panel1,BorderLayout.SOUTH);
			
			JLabel label1 = new JLabel("라벨1");
			JLabel label2 = new JLabel("라벨2");
			
			
			
			this.add(button,BorderLayout.CENTER);
			this.add(button2,BorderLayout.SOUTH); //아래
			this.add(button3,BorderLayout.NORTH); //위.혹은 PAGE_START
			
			setVisible(true);	
			
			//button1.addActionListner.BorderLayout.CENTER;
			
			
			
			
			
			
			//내장클래스?
			public class MyListener implements ActionListener {
				
				
				private int count = 0;
				@Override
				public void actionPerformed(ActionEvent e) { //매개변수e
					
					JButton btn = (JButton)e.getSource();
					
					
					count = count+1;
					System.out.println(btn.getText()+count);
					
					btn.setText("클릭");
					
					if(btn.getText() == "버튼")
						btn.setText("클릭");
					else
						btn.setText("버튼");
				}

			}

		}
		
	}

