import java.util.Scanner;



public class MedianFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 0;
		int[] number = new int [5]; //배열 선언
		
		Scanner scan= new Scanner(System.in); //스캐너 선언
		
		
		for(int i=0;i<5;i++) //0부터 5번 반복
		{
		
			System.out.print("임의의 수 5개를 입력하시오:");
			
			number[i]=scan.nextInt();
		}
			
		int mid = number[2];
		
		System.out.print("입력하신 배열의 가운데 수:"+ mid);
	}
}
