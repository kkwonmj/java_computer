package chap06_3;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("잘못된 속도: " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("올바른 속도: " + myCar.getSpeed());
		
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
			System.out.println("멈춤 속도: " + myCar.getSpeed());
		}

	}
}