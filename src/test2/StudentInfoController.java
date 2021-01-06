package test2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInfoController {

	public static void main(String[] args) {
		DBConnectionTest.loadDriver(); //로드끝남
		Connection con = DBConnectionTest.getConnection();
		
		try {
			Statement stmt = con.createStatement();
			String sql = "insert into student_info(si_num, si_name, si_etc)";
			sql += " values (4, '동동','차가운 도시 냥이')";
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 입력 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			Statement stmt = con.createStatement();
			String sql = "select * from student_info";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String str = "번호 : " + rs.getString("si_num") + ",";
				str += "이름 : " + rs.getString("si_name") + ",";
				str += "비고 : " + rs.getString("si_etc");
				System.out.println(str);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			Statement stmt = con.createStatement();
			String sql = "update student_info";
			sql += " set si_etc='사실 나에겐 따듯하지'";
			sql += " where si_num=3";
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 수정 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			Statement stmt = con.createStatement();
			String sql = "delete student_info";
			sql += " where si_num=1";
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 삭제 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBConnectionTest.close(con);
		System.out.println("프로그램 정상종료");
	}
}
