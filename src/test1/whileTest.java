package test1;

import java.util.Scanner;

public class whileTest {

	public static void main(String[] args) {
		// switch문 말고 if문으로 하세요
		// 종료는 q 를 입력해야만 종료하게 만드세요.
		System.out.println("===========================");
		System.out.println(" ========웰컴웰컴랜드======== ");
		System.out.println("===========================");
		System.out.println("===원하시는 직업을 입력해주세요===");
		System.out.println("==백수(1),건물주(2),개발자(3),탈주(q)==");
		
		
		Scanner scan = new Scanner(System.in);
		for(;;) {
			System.out.println("입력 : ");
			String cmd = scan.nextLine();
			
			if("q".equals(cmd)) {
				System.out.println("하.. 탈주 했군... 답이 없다..");
				break;
			}
			
			try {
				int num = Integer.parseInt(cmd);
				if(1==num) {
					System.out.println("백수?? 진짜로?? 다시 선택할 기회를 주겠다.");
				}else if(2==num) {
					System.out.println("건물주로 생활합니다.");
					System.out.println("사실 그런 생활은 없습니다...");
				}else if(3==num) {
					System.out.println("하하... ... ... .........");
					System.out.println("다음 생도 개발자를 고를까???!!");
				}else {
					System.out.println("제발 직업을 골라주세요!!");
				}
			}catch(Exception e) {
				System.out.println("없는 선택지입니다. 인생을 종료합니다.");
				break;
			}
			
			
		}
		
	}
}
