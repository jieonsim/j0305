package exam;

import java.util.Scanner;

/*
 
 문제. 한글과 짝을 이루는 2개의 배열을 만들고, 
 사용자로부터 영어 단어를 입력받으면 한글로 출력하는 프로그램을 만드시오
 출력 예시. {{“love”, “사랑”},{“java”, “자바”}}

 */
public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][] dictionaries = { 
				{ "love", "사랑" },
				{ "java", "자바" },
				{ "apple", "사과" },
				{ "tree", "나무" },
				{ "flower", "꽃" } };

		while (true) {
			System.out.print("영한사전(1)과 한영사전(2) 중 선택하세요(999 입력 시 종료) : ");
			int option = sc.nextInt();
			if(option == 999) {
				break;
			}
			sc.nextLine();

			System.out.print("검색할 단어를 입력하세요 : ");
			String search = sc.nextLine();

			if (option == 1) {
				for (int i = 0; i < dictionaries.length; i++) {
					if (dictionaries[i][0].equals(search)) {
						System.out.println(search + "의 한글 뜻은 " + dictionaries[i][1] + "입니다.");
					}
				}
			}

			else if (option == 2) {
				for (int i = 0; i < dictionaries.length; i++) {
					if (dictionaries[i][1].equals(search)) {
						System.out.println(search + "의 영어 뜻은 " + dictionaries[i][0] + "입니다.");
					}
				}
			}

			else {
				System.out.println("사전에서 해당 단어를 찾을 수 없습니다.");
			}
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
}
