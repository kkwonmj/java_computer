package chap06;

public class KoreaExample {

	public static void main(String[] args) {
		Korea k1 = new Korea("박자바", "011225-1234567");
		System.out.println(k1.nation);
		System.out.println("k1.name :" + k1.name);
		System.out.println("k1.ssn :" +k1.ssn);
		System.out.println("\n\n");
		
		Korea k2 = new Korea("김자바", "930525-0654321");
		System.out.println(k2.nation);
		System.out.println("k2.name :" + k2.name);
		System.out.println("k2.ssn :" +k2.ssn);
	}
}