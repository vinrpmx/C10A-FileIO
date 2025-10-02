import java.util.ArrayList;
import java.io.File;
import java.util.Collections;
import java.util.Scanner;


public class ScoreTrakker {
	private ArrayList<Student> student = new ArrayList<Student>();

	
	public ScoreTrakker(ArrayList<Student> student) {
		super();
		this.student = student;
	}
	
	public void loadDataFile(String filename) {
		try (Scanner scanner = new Scanner() {
			while(scanner.hasNextLine()) {
				String dataString = scanner.nextLine();
				String line = scanner.nextLine();
				String[] parts = line.split(",");
				
				String name = parts[0];
				//String surname = parts[1];
				int score = Integer.parseInt(parts[2]);
				
				Student s = new Student(name, score);
				
			}
		}
	}

	public void printInOrder(ArrayList<Student> student) {
		Collections.sort(student);
	}
	
	public void processFiles() {
		
	}
	
	public void main() {
		
	}
}


