
public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Television tv1=new Television(7,10,true); //텔레비전 오버로딩 생성자의 값을 넣었을 경우
		
		//tv1.setChannel(7);
		//tv1.volume=10;
		//tv1.onOff=true;
		
		tv1.print();
		//System.out.println("텔레비전의 채널은" + tv1.channel +"이고 볼륨은" +tv1.volume+"입니다.");
		
		
		Television tv2=new Television(); //오버로딩 텔레비전의 디폴트. (매개변수 값을 넣지 않았을 경우의 생성자)
		
		tv2.print();
		
		//tv2.setChannel(9);
		//tv2.volume=12;
		//tv2.onOff=true;
		String str1=new String("Hello");
		
		//System.out.println("텔레비전의 채널은" + tv2.channel +"이고 볼륨은" +tv2.volume+"입니다.");
	}

}
