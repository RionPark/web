package test;

public class ExceptionTest {

	static void printSomething(String str) throws Exception {
		if("".equals(str)) {
			throw new Exception("야.. 빈문자열을 왜 프린트 할려구 하니!!?");
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		try {
			printSomething("123");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		String str = "백이십";
		int num = Integer.parseInt(str);
		System.out.println(num);
		System.out.println("위 코드가 정상이면 난 실행됨");
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("위 코드 드라이버가 있다면 난 실행됨");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
