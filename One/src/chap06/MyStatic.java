package chap06;

public class MyStatic {
	
	static int count = 0; // static은 한 번만 초기화하고 프로그램 종료 시까지 값이 유지됨
	MyStatic(){
		this.count++;
		System.out.println(this.count);
	}

	public static void main(String[] args) {
		MyStatic my1 = new MyStatic();
		MyStatic my2 = new MyStatic();
		MyStatic my3 = new MyStatic();
		MyStatic my4 = new MyStatic();
	}
}