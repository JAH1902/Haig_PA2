
import java.lang.Math;

public class BMICalculator {

	double index(int menu, double weight, double height) {
		
		double bmi = 0;
		
		if (menu == 1) {
			
			bmi = (703 * weight) / (Math.pow(height, 2));
			
		}
		
		else if (menu == 2) {
			
			bmi = (weight) / (Math.pow(height, 2));
			
			
		}
		
		else {
			
			System.out.println("Error: invalid input");
			
		}
		
		return bmi;
		
	}
}
