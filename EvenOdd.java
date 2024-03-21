import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int n;
		int s; //나누어진 수
		
		System.out.print("정수를 입력하시오:");
		n=input.nextInt();
		
		s=n%2;
		
		
		if(s==1)
			System.out.print("홀수입니다");
		else
			System.out.print("0이거나 짝수입니다.");
				
	}

}
