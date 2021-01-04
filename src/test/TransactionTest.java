package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234");
			con.setAutoCommit(false);
			String sql = "insert into user_info";
			sql += " values(4,'이길동','lee','lee')";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			con.rollback();
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
