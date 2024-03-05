package t1_array;

// 배열 복사 : System.arrayCopy(원본배열명, 원본 배열 시작 인덱스, 타겟 배열명, 타겟 배열 시작 인덱스, 복사할 원소 개수)
public class Test8_arrayCopy {
	public static void main(String[] args) {
		int[] su1 = { 1, 3, 5, 7, 9 };
		int[] su2 = new int[su1.length];
		
		// 배열 복사(System.arrayCopy() : 깊은 복사)
		System.arraycopy(su1, 0, su2, 0, su1.length);
		
		System.out.print("su1 : " );
		for(int i = 0; i < su1.length; i++) {
			System.out.print(su1[i] + " / ");
		}
		System.out.println();

		System.out.print("su2 : " );
		for(int i = 0; i < su1.length; i++) {
			System.out.print(su2[i] + " / ");
		}
		System.out.println();
		System.out.println("=============================");
		
		su2[3] = 500;
		System.out.print("su1 : " );
		for(int i = 0; i < su1.length; i++) {
			System.out.print(su1[i] + " / ");
		}
		System.out.println();

		System.out.print("su2 : " );
		for(int i = 0; i < su1.length; i++) {
			System.out.print(su2[i] + " / ");
		}
	}
}
