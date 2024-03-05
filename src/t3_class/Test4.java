package t3_class;

// 같은 패키지 안에서는 같은 클래스 이름이 중복될 수 없다
public class Test4 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		// 같은 클래스로 만들었을 뿐이고 위 두개는 각각 다른 객체이다

		if (t1 == t2) {
			System.out.println("t1 객체와 t1 객체는 서로 같은 객체입니다.");
		} else {
			System.out.println("t1 객체와 t1 객체는 서로 다른 객체입니다.");
		}
		
		Test1 t3;
		t3 = t1;
		if (t1 == t3) {
			System.out.println("t1 객체와 t3 객체는 서로 같은 객체입니다.");
		} else {
			System.out.println("t1 객체와 t3 객체는 서로 다른 객체입니다.");
		}
		
//		Test1 t4 = null;
//		if (t1 == t4) {
//			System.out.println("t1 객체와 t4 객체는 서로 같은 객체입니다.");
//		} else {
//			System.out.println("t1 객체와 t4 객체는 서로 다른 객체입니다.");
//		}
		
		// null 비교 시는 '== / !=' 로 비교해야 한다. 아래는 실행 오류 발생
//		if(t4.equals(null)) {
//			System.out.println("t4는 null입니다.");
//		} else {
//			System.out.println("t4는 null이 아닙니다.");
//		}	
	}
}
