package chap12.thread.state.yield.join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("1~100 합: " + sumThread.getSum());
	}

}
