import java.util.Scanner;

public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		int n1; //첫번째로 입력받는 수
		int n2; //두번째로 입력받는 수
		
		System.out.print("첫번째 정수를 입력하시오:");
		n1=input.nextInt();
		
		System.out.print("두번째 정수를 입력하시오:");
		n2=input.nextInt();
		
		
		if(n1>n2) 
			System.out.print(n1);
		else
			System.out.print(n2);
	
	}

}
