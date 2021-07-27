package chap14.two;

public class Student {
	private String name;
	private int englishScore;
	private int mathScore;
	
	public Student(String name, int englishScore, int mathSocre) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathSocre;
	}
	public String getName() {return name;}
	public int getEnglishScore() {return englishScore;}
	public int getMathScore() {return mathScore;}
}
