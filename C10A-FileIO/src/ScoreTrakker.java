import java.util.ArrayList;
import java.io.FileReader;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ScoreTrakker {
	private ArrayList<Student> students = new ArrayList<Student>();
	private String[] files = {"scores.txt", "badscore.txt", "nofile.txt" };

	
	public ScoreTrakker() {
		super();
	}
	
	//Loads the data from the file and detects any incorrect format through an exception
	public void loadDataFile(String fileName) throws FileNotFoundException {
		this.students = new ArrayList<Student>();
		FileReader reader = null;
		Scanner in = null;
		String name = "";
		String strScore = "";
		reader = new FileReader(fileName);
		in = new Scanner(reader);
		while(in.hasNextLine()) {
			try {
				name = in.nextLine();
				strScore = in.nextLine();
				int score = Integer.parseInt(strScore);
				Student s = new Student(name, score);
				students.add(s);
			} catch (NumberFormatException e) {
				System.out.println("Incorrect format for " + name + " not a valid score: " + strScore);
				System.out.println();
			}
		}
		in.close();
	}

	//Sorts the array list and prints out the array
	public void printInOrder(ArrayList<Student> student) {
		System.out.println("Student Score List");
		Collections.sort(students);
		for (Student aStudent : students) {
			System.out.println(aStudent.toString());
		}
	}
	
	//Calls out the previous methods and calls out an exception if file not found
	public void processFiles() {
		for (String fileName : this.files) {
			try {
				loadDataFile(fileName);
				printInOrder(students);
				System.out.println();
			} catch (FileNotFoundException e) {
				System.out.println("Can't open file: " + fileName);
			}
		}
	}
		
	//Calls out the processFile method
	public static void main(String[] args) {
		ScoreTrakker tracker = new ScoreTrakker();
		tracker.processFiles();
	}
}