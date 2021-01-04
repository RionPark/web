package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertBookInfo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234");
			String sql = "insert into book_info";
			Statement stmt = con.createStatement();
			int cnt = stmt.executeUpdate(sql + " values(1, '달러구트 꿈 백화점','이미예', '팩토리나인','2020-07-08')");
			cnt += stmt.executeUpdate(sql + " values(2,'공정하다는 착각','마이클 샌델','와이즈베리','2020-12-01')");
			cnt += stmt.executeUpdate(sql + " values(3,'광고의 8원칙','오두환','대한출판사','2020-11-03')");
			cnt += stmt.executeUpdate(sql + " values(4,'안녕, 소중한 사람','정한경','북로망스','2020-09-16')");
			System.out.println(cnt + "권의 서적이 추가되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
