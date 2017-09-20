package assignment2_4;

/**
 * @author MANJUNATH, This class is to accept the grades in each subject and find the average grade in them.
 *
 */
import java.util.Scanner;

public class GradeOfTheStudent {

	// Method to print the grade for the subjects
	public void printGrade(int marks, String subject) {
		if (marks > 70) { // Prints A if marks is greater than 70
			System.out.println("\nGrade for " + subject + " : A");
		} else if (marks >= 61) { // Prints B if marks is in-between 61 and 70
			if (marks <= 70) {
				System.out.println("\nGrade for " + subject + " : B");
			}
		} else { // Prints C if marks is less than 61
			System.out.println("\nGrade for " + subject + " : C");
		}
	}

	// Method to calculate average of PCM and also checks if the entered value is
	// positive and calls print grade of subjects
	public void getGradeAndAvg(int physicsMarks, int chemistryMarks, int mathematicsMarks) {
		GradeOfTheStudent gradeOfTheStudent = new GradeOfTheStudent();

		if (physicsMarks <= 0 || chemistryMarks <= 0 || mathematicsMarks <= 0) { // Check for the positive value of
																					// marks and if it is negative
			// program execution is terminated.
			System.out.println();
			System.out.println("Please enter positive values to get GRADE");
			System.exit(1);
		}

		// Calls printGrade method
		gradeOfTheStudent.printGrade(physicsMarks, "PHYSICS");
		gradeOfTheStudent.printGrade(chemistryMarks, "CHEMISTRY");
		gradeOfTheStudent.printGrade(mathematicsMarks, "MATHEMATICS");

		if (physicsMarks > 0 && chemistryMarks > 0 && mathematicsMarks > 0) { // Average calculation
			int avg = (physicsMarks + chemistryMarks + mathematicsMarks) / 3;
			System.out.println("---------------------------------");
			gradeOfTheStudent.printGrade(avg, "ALL Subjects");
		}
	}

	// Main function
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in); // Gets the user input
		int physicsMarks, chemistryMarks, mathematicsMarks;

		GradeOfTheStudent gradeOfTheStudent = new GradeOfTheStudent();

		System.out.println("Enter the marks of PHYSICS: \n");
		physicsMarks = n.nextInt();
		System.out.println("Enter the marks of CHEMISTRY: \n");
		chemistryMarks = n.nextInt();
		System.out.println("Enter the marks of MATHEMATICS: \n");
		mathematicsMarks = n.nextInt();

		gradeOfTheStudent.getGradeAndAvg(physicsMarks, chemistryMarks, mathematicsMarks);

		n.close();
	}
}
