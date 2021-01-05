package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	private static final String DRIVER_CLASS_NAME = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private static final String USER = "jtest";
	private static final String PASSWORD = "ezen1234";
	
	static {
		try {
			Class.forName(DRIVER_CLASS_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConn() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
