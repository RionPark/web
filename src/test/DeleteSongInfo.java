package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteSongInfo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection con = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234");
			String sql = "delete from song_info";
			Statement stmt = con.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
