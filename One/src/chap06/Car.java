package chap06;

public class Car {
	
	String name;
	int value;
	
	Car(){ // 클래스 앞에 형이 없음
		System.out.println("나 카 생성자");
	}
	
	Car(String color, int cc){ 
		name = color;
		value = cc;
	}
}
