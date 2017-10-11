import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for Length");
		double length = input.nextDouble();
		
		System.out.print("Enter a value for Width");
		double width = input.nextDouble();
		
		System.out.print("Enter a value for Height");
		double height = input.nextDouble();
		
		double volume = length*width*height;
		System.out.println("The volume of your rectangle is: " + volume);
		
		input.close();
	}

}
