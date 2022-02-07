package forwhile;

import java.util.Scanner;

public class D_doWhile {
	
	/* [do-while문 표현식]
	 * 초기식;
	 * do {
	 * 		1회차에는 무조건 실행하고, 이후에는 조건식을 확인하여 조건을 만족하는 경우 수행할 구문(반복할 구문);
	 * 		증감식;
	 * } while(조건식);
	 * */
	
	public void testSimpleDoWhileStatement() {
		
		/* 조건을 false로 두고 실행 되는지 테스트 */
		do {
			System.out.println("최초 한 번 동작함...");
		} while(false);
		
	}
	
	public void testDoWhileExample2() {
		
		/* 키보드로 문자열 입력 받아 반복적으로 출력
		 * 단, exit가 입력되면 반복문을 종료한다.
		 * */
		Scanner sc = new Scanner(System.in);
		String str = "";
		do {
			System.out.print("문자열을 입력하세요 : ");
			str = sc.nextLine();
			System.out.println("입력한 문자 : " + str);
			
			/* 문자열(참조 자료형)은 == 비교가 불가능하다. String 클래스에서 제공하는 equals() 메소드를 통해 비교하자. */
		} while (!str.equals("exit"));
		
		System.out.println("프로그램을 종료합니다.");
		
	}

}
