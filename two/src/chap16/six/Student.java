package chap16.six;

public class Student implements Comparable<Student> {
	private String name;
	private int Score;
	
	public Student(String name, int score) {
		this.name = name;
		Score = score;
	
	
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return Score;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(Score, o.Score);
	}
}
