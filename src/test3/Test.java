package test3;

class F1 {
	int a = 1;
}

public class Test extends F1 {

	public Test() {
		this(1);
		System.out.println("하하");
	}

	public Test(int i) {
		this(1 + "");
		System.out.println("히히");
	}

	public Test(String i) {
		System.out.println("히히");
	}

	public static void main(String[] args) {
		int i=1;
		String str = "1";
		if(str.equals("1")) {
			System.out.println("아 str은 1이구나~");
		}
	}
}
