import java.util.ArrayList;
import java.io.FileReader;
import java.util.Collections;
import java.util.Scanner;

import java.io.FileNotFoundException;

public class ScoreTrakker {
	private ArrayList<Student> students = new ArrayList<Student>();

	
	public ScoreTrakker(ArrayList<Student> students) {
		super();
		this.students = students;
	}
	
	public void loadDataFile(String fileName) {
		FileReader reader = null;
		Scanner in = null;
		try {
			reader = new FileReader(fileName);
			in = new Scanner(reader);
			while(in.hasNextLine()) {
				String name = in.nextLine();
				String strScore = in.nextLine();
				int score = Integer.parseInt(strScore);
				Student s = new Student(name, score);
				students.add(s);
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}

	public void printInOrder(ArrayList<Student> student) {
		Collections.sort(students);
		for (Student aStudent : students) {
			System.out.println(aStudent.toString());
		}
	}
	
	public void processFiles(String fileName) {
		loadDataFile(fileName);
		printInOrder(students);
		
	}
	
	public void main(String[] args) {
		ScoreTrakker tracker = new ScoreTrakker(students);
		String fileName = "scores.txt";
		tracker.processFiles(fileName);
	}
}


