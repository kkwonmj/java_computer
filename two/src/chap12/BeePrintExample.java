package chap12;

import java.awt.Toolkit;

public class BeePrintExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);} catch (Exception e) {}
			
		}
		for (int i = 0; i < args.length; i++) {
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500);} catch (Exception e) {}
		}
	}

}
