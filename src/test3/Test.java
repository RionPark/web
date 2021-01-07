package test3;

class F1{
	int a=1;
}
public class Test extends F1{
	
	public Test() {
		this(1);
		System.out.println("하하");
	}
	public Test(int i) {
		this(1+"");
		System.out.println("히히");
	}
	public Test(String i) {
		System.out.println("히히");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
//		System.out.println(t.a);
	}
}
