
public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Television tv1;
		tv1=new Television();
		tv1.channel=7;
		tv1.volume=19;
		tv1.onOff=true;
		tv1.Print();
		System.out.println("텔레비전의 채널은" + tv1.channel +"이고 볼륨은" +tv1.volume+"입니다.");
		
		
		Television tv2=new Television();
		tv2.setChannel(6);
		tv2.volume=12;
		tv2.Print();
		System.out.println("텔레비전의 채널은" + tv2.channel +"이고 볼륨은" +tv2.volume+"입니다.");
	}

}
