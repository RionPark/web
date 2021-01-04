package test;

public class StaticTest {

	public int num = 1;
	public static int number = 1;
	
	public static void main(String[] args) {
		StaticTest.number = 10;
		System.out.println(StaticTest.number);
		StaticTest st = new StaticTest();
		System.out.println(st.number);
		st.number=2;
		StaticTest st1 = new StaticTest();
		System.out.println(st1.number);
		
	}
}
