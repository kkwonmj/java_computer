package chap06;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car("검정", 3000);
		
		System.out.println(myCar.name);
		System.out.println(myCar.value);
		
		Car hi = new Car();
	}
}