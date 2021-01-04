package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectSongInfo {

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
			String sql = "select * from song_info";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String str = rs.getString("si_num") +",";
				str += rs.getString("si_name") +",";
				str += rs.getString("si_genre") +",";
				str += rs.getString("si_singer") +",";
				str += rs.getString("si_creadat") +"";
				System.out.println(str);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
