import javax.swing.Timer;

public class MyCallbackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ActionListener obj = new Myclass();
		javax.management.timer.Timer t= new Timer(1000,obj);
		t.start();
		
		
	}

}

//패키지=폴더관리