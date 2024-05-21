import java.util.Scanner;

public class SafeArrayTest { //잘못된 인덱스를 띄우는 실행파일

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("총 인덱스 수를 입력해주세여:");
		int size=input.nextInt();
		
		
		SafeArray array=new SafeArray(15);
		
		
		for(int i=0; i<(array.length+1); i++) {
			array.put(i,i*10);
		}
	}
}

/* public class SafeArrayTest { //잘못된 인덱스를 띄우는 실행파일

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SafeArray array = new SafeArray(3);
		
		for(int i=0;i<(array.length+1);i++) {
			array.put(i, i*10);
		}
	}

} */
