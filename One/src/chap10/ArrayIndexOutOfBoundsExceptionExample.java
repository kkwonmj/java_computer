package chap10;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
		
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
		}else {
			System.out.println("[실행방법]");
			System.out.println("java ArrayIndexOutBoundsExceptionExample ");
			System.out.println("값1 값2");
		}
	}
} // 파라메타 넣으면 값이 정상적으로 출력, 이대로 하면 오류 남
