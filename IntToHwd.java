import java.util.Scanner;

public class IntToHwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int number;
		
		System.out.print("정수를 입력하시오:");
		number=input.nextInt();
		
		switch(number) {
		
		case 0:
			System.out.println("없음");
			break;
		case 1:
			System.out.println("하나");
			break;
		default:
			System.out.println("많음");
			break;
		
		
		}
	}

}
