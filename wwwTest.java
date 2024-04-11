import java.util.Scanner;

public class wwwTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = null;
		Scanner input=new Scanner(System.in); //스캐너추가
		
		while(str!="quit") {
			
			System.out.println("문자열을 입력하세요>");
			str=input.nextLine();
			
			System.out.println(str.startsWith("www"));
			
			if(true) {
				System.out.println(str+"은 'www'로 시작합니다.");
			}
			
			if(false) {
				System.out.println(str+"은 'www'로 시작하지않습니다.");
			}
			
			
		}
		
	}

}
