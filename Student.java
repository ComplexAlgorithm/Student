/*
*STUDENT PROJECT UPDATED WITH ARRAYS*
 * Update your Homework 3 to use arrays to store the values of your tests and finals.
Remove the instance variables that store the concepts tests and replace it with 1 array that stores
all concept tests call this array conceptArray. This array should have 3 elements since there are 2
concept tests and 1 concept final. Concept Test 1 should be placed in element 0, Concept Test 2
should be in element 1, and the Concept Final should be placed in element 2.
Remove the instance variables that store the programming tests and replace it with 1 array that
stores all programming tests call this array programmingArray. This array should have 3
elements since there are 2 programming tests and 1 programming final. Programming Test 1
should be placed in element 0, Programming Test 2 should be in element 1, and the
Programming final should be placed in element 2.
It is important to not change any method signatures in the Student class. The StudentDemo that
you have already written depends on these public method signatures and will not work if you
change them. The instance variables and the method definitions will need to change to adjust to
using arrays instead of primitive variables. The default constructor should also change to
initialize conceptArray and programmingArray to a size of 3 and set all of the elements to the
value of 0.
After making these changes to the Student.java class attempt to run your StudentDemo.java file
without any changes. If you have correctly made the changes to the Student class your
StudentDemo.java should work without any changes and should do exactly what Assignment 2
did, but it will be using arrays inside the Student class.

 */
public class Student {
//instance variables
	private String name = "";
	private int [] conceptArray;
	private int [] programmingArray;
	//private double finalPercentage;
	//private char letterGrade;
	
//static variables are the same for all objects of a class
	private static String professorName = "Anwar Ahmad";

// default constructor
	public Student() {
		name = "";
		conceptArray = new int [3];
		programmingArray = new int [3];
		
		for(int index = 0; index < 3; index++) {
			conceptArray[index] = 0;
			programmingArray[index] = 0;
		}
	}
	//non-static methods
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public int getConceptTest1() {
		return conceptArray[0];
	}
	public void setConceptTest1(int newConceptTest1) {
		if(newConceptTest1 >= 0 && newConceptTest1 <= 100) {
			conceptArray[0] = newConceptTest1;
		}
	}
	public int getProgrammingTest1() {
		return programmingArray[0];
	}
	
	public void setProgrammingTest1(int newProgrammingTest1) {
		if(newProgrammingTest1 >= 0 && newProgrammingTest1 <= 100) {
			programmingArray[0] = newProgrammingTest1;
		}
	}
	public int getConceptTest2() {
		return conceptArray[1];
	}
	public void setConceptTest2(int newConceptTest2) {
		if(newConceptTest2 >= 0 && newConceptTest2 <= 100) {
			conceptArray[1] = newConceptTest2;
		}
	}
	public int getProgrammingTest2() {
		return programmingArray[1];
	}
	public void setProgrammingTest2(int newProgrammingTest2) {
		if(newProgrammingTest2 >= 0 && newProgrammingTest2 <= 100) {
			programmingArray[1] = newProgrammingTest2;
		}
	}
	public int getConceptFinal() {
		return conceptArray[2];
	}
	public void setConceptFinal(int newConceptFinal) {
		if(newConceptFinal >= 0 && newConceptFinal <= 100) {
			conceptArray[2] = newConceptFinal;
			
			if(conceptArray[2] > conceptArray[0]) {
				conceptArray[0] = conceptArray[2];
			}
			if(conceptArray[2] > conceptArray[1]) {
				conceptArray[1] = conceptArray[2];
			}
		}
	}
	public int getProgrammingFinal() {
		return programmingArray[2];
	}
	public void setProgrammingFinal(int newProgrammingFinal) {
		if(newProgrammingFinal >= 0 && newProgrammingFinal <= 100) {
			programmingArray[2] = newProgrammingFinal;
			
			if(programmingArray[2] > programmingArray[0]) {
				programmingArray[0] = programmingArray[2];
			}
			if(programmingArray[2] > programmingArray[1]) {
				programmingArray[1] = programmingArray[2];
			}
		}
	}
	
	public double calculateFinalPercentage() {
		double finalPercentage = (conceptArray[0] * .20) + (programmingArray[0] * .20) + (conceptArray[1] * .20) 
				+ (programmingArray[1] * .20) + (conceptArray[2] * .10)
				+ (programmingArray[2] * .10);
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
