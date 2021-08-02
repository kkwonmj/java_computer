package chap16.two;

import java.util.Scanner;

public class Dan99 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        while(true){
           System.out.print("구구셈 몇단 :");
           int dan = scan.nextInt();
           if(!(dan==0 || dan == 1)){
              System.out.println(dan+" 단 출력");
              for (int j = 1; j <= 9; j++) {
                 System.out.println(dan + " * " + j + " = " + dan*j + "\n");
              }
            }
            else
          {
             System.out.print("프로그램을 종료합니다.");
             scan.close();
           }
        }
      }
    }