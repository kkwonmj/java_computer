package chap08_2;

import chap08.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();

	}

}
