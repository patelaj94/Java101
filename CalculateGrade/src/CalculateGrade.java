import java.util.Scanner;


public class CalculateGrade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char grade;
		System.out.println("Please enter your grade: ");
		double score = input.nextDouble();
		
		if(score >= 90.0)
			grade = 'A';
		else if(score >= 80.0)
			grade = 'B';
		else if(score >= 70.0)
			grade = 'C';
		else if(score >= 60.0)
			grade = 'D';
		else 
			grade = 'F';
		
		System.out.println("Your Grade: " + grade);
		
		input.close();
	}

}
