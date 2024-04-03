
public class Television {

	//전달하는 용도의 클래스여서 메인함수 추가하지 않는다.
	
		int channel; //채널번호
		int volume; //볼륨
		boolean onOff; //전원 상태

		
		void Print() {
			
			System.out.println("텔레비전의 채널은" + channel +"이고 볼륨은" +volume+"입니다.");
		}
		
		public void setChannel(int newChannel){
			channel=newChannel;
		}
}
