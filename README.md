# Student
program keeps track of grades and scores in a computer science class.

Create an object-oriented program that tracks your progress as a student in this class. The
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
The second part of this program should be developed in a class called StudentDemo. This class
will have a main method inside of it where an object of the Student class will be created. Then
the user will be given options to update their name or any of their scores. There should be an
option for each test and final. Finally there should an option to look at all the information about
the student. This main method should also have a loop to allow this program to continue running
until the user chooses the last option which is to exit the program. If the user chooses an invalid
option then an error message should be printed and the program should continue running until
the user chooses to exit the program. 
