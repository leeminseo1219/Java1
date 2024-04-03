	
	public class KoreanChar {
	    public static void main(String[] args) {
	        // '가'부터 '힣'까지의 유니코드 범위
	        char start = '\uAC00';
	        char end = '\uD7A3';

	        char current = start;

	        do {
	            // 현재 문자 출력
	            System.out.print(current);

	            // 한글 자음 분리
	            int consonant = (current - '\uAC00') % 28;

	            // 자음이 변경되면 "—…—" 출력
	            if (consonant == 0 && current != start) {
	                System.out.print("\n—…—\n");
	            }

	            // 다음 문자로 이동
	            current++;

	        } while (current <= end);
	    }
	}
