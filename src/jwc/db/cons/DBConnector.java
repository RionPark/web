package jwc.db.cons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnector {
	public static void loadDriver() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection open() {
		try {
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
