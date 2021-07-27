package chap14.two;

public class UsingLocalVariable {
	void method(int arg) { // 
		int localVar = 40; // arg, localVar은 final 특성을 가짐

		MyFunctionInterface fi = ()->{
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.method();
	}

}
