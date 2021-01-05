package test1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserInfoController {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("회원가입할 번호, 이름, 아이디, 비밀번호를 입력해주세요");
		System.out.print("번호 : ");
		String uiNum = scan.nextLine();
		System.out.print("이름 : ");
		String uiName = scan.nextLine();
		System.out.print("아이디 : ");
		String uiId = scan.nextLine();
		System.out.print("비밀번호 : ");
		String uiPwd = scan.nextLine();
		Connection con = DBConn.getConn();
		String sql = "insert into user_info(ui_num, ui_name, ui_id, ui_pwd)";
		sql += " values(" + uiNum + ",'" + uiName + "','" + uiId + "','" + uiPwd + "')";
		try {
			Statement stmt = con.createStatement();
			int cnt = stmt.executeUpdate(sql);
			if(cnt==1) {
				System.out.println("회원가입이 완료 되었습니다.");
			}
		} catch (SQLException e) {
			System.out.println("뭔지 모르겠지만 일단 에러남~~ 바이~");
		}
		
				
	}
}
