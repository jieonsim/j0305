package t4_field;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();

		System.out.println(t1.su1);
		System.out.println(t1.su2);
		System.out.println(t1.d1);
		System.out.println(t1.d2);
		System.out.println(t1.l1);
		System.out.println(t1.l2);

		System.out.println();

		Test2 t2 = new Test2();
		System.out.println("t2.name : " + t2.name);
		
		Test2 t3 = new Test2();
		System.out.println("t3.name : " + t3.name);
		t3.name = "김말숙";
		System.out.println("t3.name : " + t3.name);		
	}
}
