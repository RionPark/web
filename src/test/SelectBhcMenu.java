package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectBhcMenu {

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
				String sql = "select * from bhc_menu";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					String str = rs.getString("bm_num") + ",";
					str += rs.getString("bm_name") + ",";
					str += rs.getString("bm_type") + ",";
					str += rs.getString("bm_price") + ",";
					str += rs.getString("bm_desc");
					System.out.println(str);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
