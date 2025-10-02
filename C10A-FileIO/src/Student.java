public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	
	//takes difference of score
	public int compareTo(Student otherStudent) {
		return this.score - otherStudent.score;
	}
	
	
	//toString that returns the name of the student and their score
	public String toString() {
		return name + " " + score;
	}
}