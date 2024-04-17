
public class Television {

	//전달하는 용도의 클래스여서 메인함수 추가하지 않는다.
	
		private int channel; //채널번호
		private int volume; //볼륨
		private boolean onOff; //전원 상태
		
		public Television() {
			this(1,1,false); //디스는 텔레비전 본인.
			//channel=1;
			//volume=1;
			//onOff=false;
		} //텔레비전 오버로딩의 디폴트 값
		
		//생성자 (int c, int v, boolean o)
		
		public Television(int c, int v, boolean o) {
			this.channel=c;
			this.volume=v; 
			onOff=o;
		} //생성자 함수. 오버로딩 매개변수가 있는 버전

		
		public void print() {
			
			System.out.println("텔레비전의 채널은" + channel +"이고 볼륨은" +volume+"입니다.");
		}
		
		public int getChannel(){
			return channel;
		}
}
