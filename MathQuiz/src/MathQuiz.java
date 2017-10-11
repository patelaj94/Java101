import java.util.Random;
import java.util.Scanner;


public class MathQuiz {

	public static void main(String[] args) {
		Random rand = new Random();

		Scanner input = new Scanner(System.in);
		int number1 = rand.nextInt(10) + 1;
		int number2 = rand.nextInt(10) + 1;
		int trueAnswer = number1+number2;
		
		System.out.println("What is " + number1 + " + " + number2 + "? ");
		int userAnswer = input.nextInt();
		if(trueAnswer == userAnswer){
			System.out.println("Correct!");
		}
		else{
			System.out.println("Sorry Wrong Answer");
		}
		input.close();
	}

}