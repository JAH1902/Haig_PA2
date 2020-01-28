
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		// Declares the variables
		double height, weight, bmi;
		int menu;
		
		// Sets up the scanner
		Scanner scn = new Scanner(System.in);
		
		// User prompts for the menu
		System.out.println("Welcome to your BMI Calculator!");
		System.out.println("Select the unit of measurements:");
		System.out.println("1) English Units (inches, pounds)");
		System.out.println("2) Metric Units (meters, kilograms)");
		menu = scn.nextInt();
		
		// User prompts to input weight
		System.out.println("How much do you weigh?");
		weight = scn.nextDouble();
		
		// User prompts to input height
		System.out.println("How tall are you?");
		height = scn.nextDouble();
		
		// Sends the data to the double function to be tabulated
		BMICalculator calc = new BMICalculator();
		bmi = calc.index(menu, weight, height);
		
		// Displays the returned value
		System.out.printf("Your BMI is %.2f", bmi);
	
		
	}

}
