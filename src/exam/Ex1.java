package exam;

public class Ex1 {
	public static void main(String[] args) {
		int[] lotto = new int[6];

		// 6개의 숫자를 임의로 뽑아서 배열에 저장
		for (int i = 0; i < lotto.length; i++) {
			while (true) {
				int number = (int) (Math.random() * 45) + 1;
				boolean isDuplicate = false; // 생성한 숫자가 중복인지 아닌지를 확인하는 변수
				for (int j = 0; j < i; j++) {
					if (lotto[j] == number) { // 생성한 숫자가 배열에 이미 있는지 확인
						isDuplicate = true;
						break; // 중복된 숫자가 있을 경우 탈출
					}
				}
				if (!isDuplicate) {
					lotto[i] = number;
					break; // 중복된 숫자가 없을 경우 해당 숫자를 배열에 저장
				}
			}
		}

		// 6개의 로또 번호를 오름차순 정렬
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = 0; j < lotto.length - i - 1; j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
				}
			}
		}

		// 출력
		System.out.println("이번주 행운의 번호는 ?");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]);
			if (i < lotto.length - 1) {
				System.out.print(" / ");
			}
		}
	}
}
