/* Requirements Analysis:
 *  Create an object-oriented program that tracks your progress as a student in this class. The
program should keep track of your name and your scores on graded activities in this class. The
scores on each test and each final should be stored separately. The program should allow a
student to enter his or her name, a test score, or a final exam score. All scores must range
between 0 and 100. Any time a user enters an invalid value that value will be ignored and will
not be saved.
Since this program is object-oriented it must be developed first as a class called Student. This
class should store name and the student scores as instance variables. There should be one
instance variable for each of the following: name, concept test 1, programming test 1, concept
test 2, programming test 2, concept final, and programming final. These instance variables
should be made private to prevent invalid values from being stored in them, but there should be
ways to access and mutate these instance variables using public methods. This class should also
have a default constructor (no parameters) setting the name to blank and making each of the
other scores of the student set to 0.
Design:
1. Create student class
2. Create instance variables for name, conceptTest1, programmingTest1, conceptTest2, programmingTest2,
 conceptFinal, programmingFinal
3. Make instance variables private
4. Create public non-static methods for each instance variable
 */
public class Student {
//instance variables
	private String name = "";
	private int conceptTest1;
	private int programmingTest1;
	private int conceptTest2;
	private int programmingTest2;
	private int conceptFinal;
	private int programmingFinal;
	//private double finalPercentage;
	//private char letterGrade;
	
//static variables are the same for all objects of a class
	private static String professorName = "Anwar Ahmad";

// default constructor
	public Student() {
		name = "";
		conceptTest1 = 0;
		programmingTest1 = 0;
		conceptTest2 = 0;
		programmingTest2 = 0;
		conceptFinal = 0;
		programmingFinal = 0;
	}
	//non-static methods
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public int getConceptTest1() {
		return conceptTest1;
	}
	public void setConceptTest1(int newConceptTest1) {
		if(newConceptTest1 >= 0 || newConceptTest1 <= 100) {
			conceptTest1 = newConceptTest1;
		}
	}
	public int getProgrammingTest1() {
		return programmingTest1;
	}
	
	public void setProgrammingTest1(int newProgrammingTest1) {
		if(newProgrammingTest1 >= 0 || newProgrammingTest1 <= 100) {
			programmingTest1 = newProgrammingTest1;
		}
	}
	public int getConceptTest2() {
		return conceptTest2;
	}
	public void setConceptTest2(int newConceptTest2) {
		if(newConceptTest2 >= 0 || newConceptTest2 <= 100) {
			conceptTest2 = newConceptTest2;
		}
	}
	public int getProgrammingTest2() {
		return programmingTest2;
	}
	public void setProgrammingTest2(int newProgrammingTest2) {
		if(newProgrammingTest2 >= 0 || newProgrammingTest2 <= 100) {
			programmingTest2 = newProgrammingTest2;
		}
	}
	public int getConceptFinal() {
		return conceptFinal;
	}
	public void setConceptFinal(int newConceptFinal) {
		if(newConceptFinal >= 0 || newConceptFinal <= 100) {
			conceptFinal = newConceptFinal;
		}
	}
	public int getProgrammingFinal() {
		return programmingFinal;
	}
	public void setProgrammingFinal(int newProgrammingFinal) {
		if(newProgrammingFinal >= 0 || newProgrammingFinal <= 100) {
			programmingFinal = newProgrammingFinal;
		}
	}
	
	public double calculateFinalPercentage() {
		double finalPercentage = (conceptTest1 * .20) + (programmingTest1 * .20) + (conceptTest2 * .20) 
				+ (programmingTest2 * .20) + (conceptFinal * .10)
				+ (programmingFinal * .10);
		return finalPercentage;
	}
	
	public char determineLetterGrade() {
		double finalPercentage = this.calculateFinalPercentage();
		char grade;
		if (finalPercentage >= 90) {
			grade = 'A';
		}
		else if (finalPercentage >= 80) {
			grade = 'B';
		}
		else if (finalPercentage >= 70) {
			grade = 'C';
		}
		else if(finalPercentage >= 60) {
			grade = 'D';
		}
		else {
			grade ='F';
		}
		return grade;
	}
	//static methods
	public static void setProfessorName(String newProfessorName) {
		professorName = newProfessorName;
	}
	public static String getProfessorName() {
		return professorName;
	}
	
}
