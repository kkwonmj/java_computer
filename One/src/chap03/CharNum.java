package chap03;

import java.util.Scanner;

public class CharNum {

	public static void main(String[] args) {

		System.out.println("문자를 입력하시오. (a~z)");
		
		Scanner sc = new Scanner(System.in);
		char ab = sc.next().charAt(0);

		for(char b = 'a'; b <='z'; b++) {
			if (ab == b ) { System.out.println("문자입니다");
				break;
			} else { System.out.println("특수문자입니다");
			sc.close();}
			
		}
	}
}