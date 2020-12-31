package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Java DataBase Connector : JDBC
public class ConnTest {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234");
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();
			String sql = "insert into song_info(si_num, si_name, si_genre, si_singer, si_creadat)";
			sql += "values(1, '애국가','KPOP','우리모두','19401201')";
			
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "개 insert되었음");
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}






