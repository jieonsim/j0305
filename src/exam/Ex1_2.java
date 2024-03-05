package exam;

public class Ex1_2 {
	public static void main(String[] args) {
		int[] lotto = new int[6];

        // 6개의 숫자를 임의로 뽑아서 배열에 저장
        for (int i = 0; i < lotto.length; i++) {
            while (true) {
                int number = (int) (Math.random() * 45) + 1;
                boolean isDuplicate = false;
                for (int j = 0; j < i; j++) {
                    if (lotto[j] == number) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    lotto[i] = number;
                    break;
                }
            }
        }

        // 버블 정렬로 배열 정렬
        for (int i = 0; i < lotto.length - 1; i++) {
            for (int j = 0; j < lotto.length - i - 1; j++) {
                if (lotto[j] > lotto[j + 1]) {
                    // 인접한 원소와 비교 후 필요시 교환
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