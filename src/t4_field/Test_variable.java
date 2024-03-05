package t4_field;

public class Test_variable {
	int su3 = 10;
	public void atom() {
		int su1 = 100;

		for (int i = 0; i < 5; i++) {
			int su2 = 200 * i;
			System.out.println(su1 + su2);
		}		
		su3 += su1;
		System.out.println("su3 : " + su3);
		// main 메소드가 없어서 여기서는 출력 불가
	}
}
