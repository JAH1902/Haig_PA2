
public class Decrypter {

	int[] decrypt(int[] number){
		
		// Declares arrays and integers
		int[] temp = new int[4];
		int[] fin = new int[4];
		int i;
		
		// Loops for each element in array
		for (i = 0; i < 4; i++) {
			
			// If the number is above the threshold
			if (number[i] >= 7) {
				
				// Subtract constant
				temp[i] = (number[i] - 7);
				
			}
			
			// If the number is below the threshold
			else if (number[i] < 7) {
				
				// Add constant
				temp[i] = number[i] + 3;
				
			}
			
		}
		
		// Loops for each element in array
		for (i = 0; i < 4; i++) {
			
			// If it is the first element
			if (i == 0) {
				
				// Makes it the 3rd element in the final array
				fin[2] = temp[i];
				
			}
			
			// If it's the second element
			else if (i == 1) {
				
				// Makes it the 4th element in the final array
				fin[3] = temp[i];
				
			}
			
			// If it's the third element
			else if (i == 2) {
				
				// Makes it the 1st element in the final array
				fin[0] = temp[i];
				
			}
			
			// If it's the 4th element
			else {
				
				// Makes it the 2nd element in the final array
				fin[1] = temp[i];
				
			}
			
		}
		
		// Returns the final array to the main function
		return fin;
		
	}

}
