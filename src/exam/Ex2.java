package exam;

import java.util.Scanner;

/*
 문제. 년도와 달을 입력하면 해당년도 월의 마지막 일자를 출력하는 프로그램을 완성하시오
 예시. 2023년 2월 입력 시 28일 출력 / 2024년 2월 입력 시 29일 출력
 윤년 ? 1. 4로 나눠떨어지면 윤년 ? 2. 이때 100으로 나눠 떨어지면 평년 ? 3. 이 년도가 400으로 나눠떨어지면 윤년
 
 월별 마지막 일자
 1,3,5,7,8,10,12월 : 31일
 4,6,9,11월 : 30일
 2월 : 평년 - 28일 / 윤년 - 29일
 */
public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("년도를 입력하세요(999 입력 시 종료) : ");
			int year = sc.nextInt();
			if (year == 999) {
				break;
			}

			boolean isLeapyear = ((year % 400) == 0 || (year % 4) == 0 && (year % 100) != 0);

			if (isLeapyear) {
				System.out.println(year + "년은 윤년입니다.");
			} else {
				System.out.println(year + "년은 평년입니다.");
			}
			
			System.out.print("월을 입력하세요 : ");
			int month = sc.nextInt();

			int day;
			if (month == 2) {
				day = isLeapyear ? 29 : 28;
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				day = 30;
			} else {
				day = 31;
			}

			System.out.println(year + "년 " + month + "월의 마지막 일자는 " + day + "일입니다.");
			System.out.println();
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
}
