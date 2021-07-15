package chap06;

public class ThisCar {
	
	String model;
	int speed;		// 필드
	
	ThisCar(String model){
		this.model = model; // 여기에 있는 model은 다 용도가 같음 (this.model = 위에 선언한 변수, 
		// 다른 데서 가지고 온 걸 우선시하고 싶으면 this를 적음, 전역 변수를 진역하기 위해)
	} // 생성자
	
	void setSpeed(int speed) { // 여기서 int speed가 지역 변수
		this.speed = speed;
	} // 메소드

	void run() { // 멤버 함수
		for (int i = 10; i <= 50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		}
	}
}