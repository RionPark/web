package test1;

public class SqlTest {

	public static void main(String[] args) {
		String sql ="insert into bhc_menu";
		String bmNum = "5";
		String bmName = "'반반'";
		sql += " values(" + bmNum + "," + bmName + ")";
		System.out.println(sql);
	}
}
