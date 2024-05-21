
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MyListener implements ActionListener {
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) { //매개변수e
		//label.setText("1번 버튼 클릭"+count);
		
		private int count = 0;
		//label.setText("1번 버튼 클릭"+count);
		//label.setText("2번 버튼 클릭"+count);
		
		
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
