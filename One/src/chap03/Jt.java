package chap03;

import java.util.Scanner;

public class Jt {

	public static void main(String[] args) {
		
		Scanner my_in = new Scanner(System.in);
		int ken;
		
		System.out.print("10진수를 입력하시오 : " );
		ken = Integer.parseInt(my_in.next());
		my_in.close();
		System.out.println("10진수 : " +ken);
		System.out.println("2진수 : " +Integer.toBinaryString(ken));
		System.out.println("8진수 : " +Integer.toOctalString(ken));
		System.out.println("16진수: " + Integer.toHexString(ken));
	}
}