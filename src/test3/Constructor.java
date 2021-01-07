package test3;
class F{
	public F() {
		System.out.println("난 F 생성자");
	}
}
public class Constructor extends F{
	public Constructor() {
		this(3);
		System.out.println("기본 생성자");
	}
	public Constructor(String str) {
		System.out.println("String있는 생성자");
	}
	public Constructor(int str) {
		System.out.println("int있는 생성자");
	}
}


class Execute{
	public static void main(String[] args) {
		new Constructor();
	}
}