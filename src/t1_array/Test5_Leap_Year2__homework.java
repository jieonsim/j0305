package t1_array;

import java.util.Scanner;

// 년도와 달을 입력하면 해당년도 월의 마지막 일자를 출력하는 프로그램을 완성하시오
// 예시 ) 2023년 2월 입력 시 28일 출력
// 2024년 2월 입력 시 29일 출력
//윤년 ? 1. 4로 나눠떨어지면 윤년 ? 2. 이때 100으로 나눠 떨어지면 평년 ? 3. 이 년도가 400으로 나눠떨어지면 윤년

public class Test5_Leap_Year2__homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();

		// 1번 방법
		if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0) {
			System.out.println(year + "은 윤년입니다.");
		} else {
			System.out.println(year + "은 평년입니다.");
		}
		
		
		// 2번 방법
		if((year % 400) == 0 || (year % 4) == 0 && (year % 100) != 0) {
			System.out.println(year + "은 윤년입니다.");
		}
		else {
			System.out.println(year + "은 평년입니다.");
		}
		sc.close();
	}
}
