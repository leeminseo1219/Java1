public class SafeArray {

	private int a[];
	public int length;
	
	public SafeArray(int size) {
		a=new int[size];
		length=size;
	}
	
	public void put(int index, int value) { //매개변수 인덱스 밸유
		
		if (index<length && index >=0)
			a[index]=value;
		else
			System.out.println("잘못된 인덱스"+index);
	}
	
	public int get(int index) {
		return 0;
	}
}


/* public class SafeArray {

	private int a[];
	public int length;
	public SafeArray(int size) {
		a=new int[size];
		length=size;
	}
	public void put(int index,int value) { 
		//확인
		if(index<length && index >=0)
			a[index]=value;
		else
			System.out.println("잘못된 인덱스"+index);
	}
	public int get(int index) {
		return 0;
		
	}
} */

