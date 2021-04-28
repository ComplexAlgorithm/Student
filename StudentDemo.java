/*Requirements Analysis:
The second part of this program should be developed in a class called StudentDemo. This class
will have a main method inside of it where an object of the Student class will be created. Then
the user will be given options to update their name or any of their scores. There should be an
option for each test and final. Finally there should an option to look at all the information about
the student. This main method should also have a loop to allow this program to continue running
until the user chooses the last option which is to exit the program. If the user chooses an invalid
option then an error message should be printed and the program should continue running until
the user chooses to exit the program. 
Design:
1. Open student class and main method and Scanner
2. Create student object
3. create option variable
4.do{
5. option 1 - update name
6. option 2 - update conceptTest1
7. option 3 - update programmingTest1
8. option 4 - update conceptTest2
9. option 5 - update programmingTest2
10. option 6 - update conceptFinal
11. option 7 - update programmingFinal
12. option 8 - display all information
13. option 9 - exit the program
14. Save options
15. if option < 1 && option > 9
16. Print error message
17. While option != 9
 */
import java.util.Scanner;
public class StudentDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		Student me = new Student();
			int option;
			do {
				System.out.println("Press 1 to update your name.");
				System.out.println("Press 2 to update the name of your professor.");
				System.out.println("Press 3 to update your score for concept test 1.");
				System.out.println("Press 4 to update your score for programming test 1.");
				System.out.println("Press 5 to update your score for concept test 2.");
				System.out.println("Press 6 to update your score for programming test 2.");
				System.out.println("Press 7 to update your score for concept final test.");
				System.out.println("Press 8 to update your score for programming final test.");
				System.out.println("Press 9 to display all your information.");
				System.out.println("Press 10 to exit the program.");
				option = keyboard.nextInt();
				keyboard.nextLine();
				
				if(option == 1) {
					System.out.println("Enter your name.");
					String newName = keyboard.nextLine();
					me.setName(newName);
				}
				else if(option ==2) {
					System.out.println("Enter the name of your professor.");
					String newProfessorName = keyboard.nextLine();
					Student.setProfessorName(newProfessorName);
				}
				else if(option == 3) {
					System.out.println("Enter your score for concept test 1.");
					int newScore = keyboard.nextInt();
					me.setConceptTest1(newScore);
				}
				else if(option == 4) {
					System.out.println("Enter your score for programming test 1.");
					int newScore = keyboard.nextInt();
					me.setProgrammingTest1(newScore);
				}
				else if(option == 5) {
					System.out.println("Enter your score for concept test 2.");
					int newScore = keyboard.nextInt();
					me.setConceptTest2(newScore);
				}
				else if(option == 6) {
					System.out.println("Enter your score for programming test 2.");
					int newScore = keyboard.nextInt();
					me.setProgrammingTest2(newScore);
				}
				else if(option == 7) {
					System.out.println("Enter your score for Concept final test.");
					int newScore = keyboard.nextInt();
					me.setConceptFinal(newScore);
				}
				else if (option == 8) {
					System.out.println("Enter your score for programming final test.");
					int newScore = keyboard.nextInt();
					me.setProgrammingFinal(newScore);
				}
				else if(option == 9) {
					System.out.println("Name: " + me.getName());
					System.out.println("Professors name: " + Student.getProfessorName());
					System.out.println("Concept Test 1: " + me.getConceptTest1());
					System.out.println("Programming Test 1: " + me.getProgrammingTest1());
					System.out.println("Concept Test 2: " + me.getConceptTest2());
					System.out.println("Programming test 2: " + me.getProgrammingTest2());
					System.out.println("Concept Final Test:  " + me.getConceptFinal());
					System.out.println("Programming Final Test: " + me.getProgrammingFinal());
					System.out.println("Final Percentage for class: " + me.calculateFinalPercentage());
					System.out.println("Letter Grade for class: " + me.determineLetterGrade());
				}
				else if(option == 10) {
					System.out.println("Goodbye!Thank you for using my program!");
				}
				
				else if(option < 1 || option > 9) {
					System.out.println("Error!");
				}
			}while(option != 10);
		

	}

}
