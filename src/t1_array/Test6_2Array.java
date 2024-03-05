package t1_array;

import java.util.Scanner;

// 2차원 배열 연습하기(100명 이내 학생이 입력된다)

/*
            성적표
 번호 이름 국어 영어 수학  총점  평균  학점 순위
  1  지언 100 90  80  270  90   A   1
  2  철수 98  95  80  ..            3
  3  짱구                           2
  
                           총 평균 : ?
 */
public class Test6_2Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 작업에 필요한 변수 선언
		String[] name = new String[100];
		int[][] score = new int[100][4];
		double[] average = new double[100];
		char[] grade = new char[100];
		int count = 0;
		int total = 0;
		int tot = 0;
		String[] title = { "이름", "국어", "영어", "수학", "총점", "학점" };

		// 학생 자료 입력과 계산 처리
		for (int i = 0; i < name.length; i++) {
			System.out.print("학생 이름을 입력하세요(종료 시 999입력) : ");
			name[i] = sc.next();
			if (name[i].equals("999")) {
				break;
			}
			for (int j = 0; j < 3; j++) {
				System.out.print(title[j + 1] + " 점수를 입력하세요 : ");
				score[i][j] = sc.nextInt();
				total += score[i][j];
			}

			score[i][3] = total;
			average[i] = total / 3.0;
			if (average[i] >= 90) {
				grade[i] = 'A';
			} else if (average[i] >= 80) {
				grade[i] = 'B';
			} else if (average[i] >= 70) {
				grade[i] = 'C';
			} else if (average[i] >= 60) {
				grade[i] = 'D';
			} else {
				grade[i] = 'F';
			}
			tot += total;
			total = 0;
			count++;
		}

		// 입력한 학생 자료와 계산된 값들을 출력 처리
		System.out.println("\n\t\t*** 성 적 표***");
		System.out.println("============================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("------------------------------------------------------------");
		for (int i = 0; i < count; i++) {
			System.out.print((i + 1) + "\t" + name[i] + "\t");
			for (int j = 0; j < 4; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.printf("%.2f\t%c\n" , average[i], grade[i]);
		}
		System.out.println("------------------------------------------------------------");
		System.out.printf("\t\t\t총 평균 : %.2f, 인원 수 : %d명\n", ((double)(tot/count) / 3), count);
		System.out.println("============================================================");
		sc.close();
	}
}
