import java.util.Scanner;

public class HwdToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner input=new Scanner(System.in);
			String h;
			
			System.out.print("정수를 입력하시오:");
			h=input.next();
			
			switch(h) {
			
		
			case "하나":
				System.out.println(1);
				break;
			case "일":
				System.out.println(1);
				break;
			case "첫째":
				System.out.println(1);
				break;
			case "둘":
				System.out.println(2);
				break;
			case "둘째":
				System.out.println(2);
				break;
			case "이":
				System.out.println(2);
				break;
			default:
				System.out.println(0);
				break;
			
			
			}
		}
	}

