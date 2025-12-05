import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=== WELCOME TO GRADE CALCULATOR ===");
		
		System.out.print("Enter math score: ");
		int mathScore = scanner.nextInt();
		
		System.out.print("Enter science score: ");
		int scienceScore = scanner.nextInt();
		scanner.nextLine();
		
		if(mathScore < 0 || scienceScore < 0) {
			System.out.print("Invalid score, score cannot be less than 0");
		} else if(mathScore > 100 || scienceScore > 100) {
			System.out.print("Invalid score, score cannot be greater than 100");
		} else if((mathScore + scienceScore) / 2.0 >= 70.0) {
			System.out.println("Result: Pass - Congratulations");
		} else {
			System.out.println("Result: Fail - Keep working hard");
		}
		System.out.println();
		
		for(int num = 1; num <= 10; num++) {
			if(num % 2 == 0) {
				continue;
			}
			System.out.print(num + ", ");
		}
		System.out.println();
		System.out.println("\nProgram completed successfully.");
		scanner.close();
	}

}