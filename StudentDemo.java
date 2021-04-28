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
