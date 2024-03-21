import java.util.Scanner;

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		
		double b,c; //사용자에게 입력받는 상수 1과2
		
		
		System.out.print("첫번째 상수를 입력하시오:");
		b=input.nextFloat();
		
		System.out.print("두번째 상수를 입력하시오:");
		c=input.nextFloat();
		
		double algebra=b*b-4.0*c; //에이가 여기서 1이므로 생략됨(근의 공식)
		double r=Math.sqrt(algebra); //방정식에서 루트 안의 수. Math.sqrt()는 제곱근을 구하는 메소드이다.
		
		double r1=(-b+r)/2.0;
		double r2=(-b-r)/2.0;
		
		System.out.println("근은"+r1);
		System.out.println("근은"+r2);

		
	}

}
