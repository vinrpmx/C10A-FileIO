public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public int compareTo(Student otherStudent) {
		return this.score - otherStudent.score;
	}
	
	
	//toString to be generated on Eclipse
	public String toString() {
		return name + " " + score;
	}
}
