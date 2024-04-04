import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		int i; //입력받은 수
		int d; //나눠서 얻은 나머지
		
		
		System.out.print("정수를 입력하시오:");
		i=input.nextInt();
		
		if(i%3==0)
			System.out.print("입력하신 수는 3의 배수입니다.");
	}
}
