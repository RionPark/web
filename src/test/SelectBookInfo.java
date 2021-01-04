package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectBookInfo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			try {
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234");
				Statement stmt = con.createStatement();
				String sql = "select * from book_info";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					String str = rs.getString("bi_num") + ",";
					str += rs.getString("bi_name") + ",";
					str += rs.getString("bi_writer") + ",";
					str += rs.getString("bi_vendor") + ",";
					str += rs.getString("bi_credat");
					System.out.println(str);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
