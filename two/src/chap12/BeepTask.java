package chap12;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
		toolkit.beep();
		try {
			toolkit.beep();
		} catch (Exception e) {}
		}
	}

}
