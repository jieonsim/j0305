package j0304_ex_ref;

/*
 
1번. 배열을 이용한 3,6,9 게임
1~100까지의 수를 차례로 출력하되 3, 6, 9 자리는 숫자가 아닌,
'짝'이라는 문자로 대치하시오.(한줄에 10개씩 출력하시오)

1	2	짝	4	5	짝	7	8	짝	10	
11	12	짝	14	15	짝	17	18	짝	20	
21	22	짝	24	25	짝	27	28	짝	짝	
짝	짝	짝짝	짝	짝	짝짝	짝	짝	짝짝	40	
41	42	짝	44	45	짝	47	48	짝	50	
51	52	짝	54	55	짝	57	58	짝	짝	
짝	짝	짝짝	짝	짝	짝짝	짝	짝	짝짝	70	
71	72	짝	74	75	짝	77	78	짝	80	
81	82	짝	84	85	짝	87	88	짝	짝	
짝	짝	짝짝	짝	짝	짝짝	짝	짝	짝짝	100	


 */
public class Test1 {
	public static void main(String[] args) {
		String[] num = new String[100];
		int sw;
		String temp;

		// num 배열에 3, 6, 9 대신에 '짝' 문자열을 저장
		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) + ""; // -> 문자로 바꾸기 위해 + ""; 추가. toString 과 비슷
			temp = ""; // temp에 누적하기 위해 초기값을 줌
			sw = 0; // 스위치 기법, 짝이 되면 1이 될 것임

			for (int j = 0; j < num[i].length(); j++) {
				// charAt를 이용해서 하나하나씩 비교
				if (num[i].charAt(j) == '3' || num[i].charAt(j) == '6' || num[i].charAt(j) == '9') {
					temp += "짝";
					sw = 1;
				}
			}
			if (sw == 1) {
				num[i] = temp;
			}
		}

		// num[] 배열에 저장된 값을 10개씩 출력
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}
}
