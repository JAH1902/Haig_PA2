
public class Encrypter {

	int[] encrypt(int[] number) {
	
		// Declares the arrays and integers
		int[] temp = new int[4];
		int[] fin = new int[4];
		int i, tem;
		
		// For each element in the array
		for (i = 0; i < 4; i++) {
			
			// Encrypts the number
			temp[i] = (number[i] + 7) % 10;
				
		}
		
		// For each element in the array
		for (i = 0; i < 4; i++) {
			
			// Replaces the first and third elements of the array
			if (i == 0) {
				
				fin[2] = temp[i];
				
			}
			
			// Replaces the second and fourth elements of the array
			else if (i == 1) {
				
				fin[3] = temp[i];
				
			}
			
			// Replaces the first and third elements of the array
			else if (i == 2) {
				
				fin[0] = temp[i];
				
			}
			
			// Replaces the second and fourth elements of the array
			else if (i == 3) {
				
				fin[1] = temp[i];
				
			}
			
		}
		
		// Returns the final array
		return fin;
	
	}

}
