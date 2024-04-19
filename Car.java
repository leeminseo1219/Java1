
public class Car {


	private String color; //색상
	private int speed; //속도
	private int gear; //기어
	
	@Override //소스 메뉴에서 투스트링 메소드 자동생성 가능
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) {
		gear=g;
	}
	
	void speedUp() {
		speed=speed+10;
	}
	
	void speedDown() {
		speed=speed-10;
	}
	
	

}
