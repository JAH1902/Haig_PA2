
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		
		// Sets up the scanner function and the exterior classes
		Encrypter enc = new Encrypter();
		Decrypter dec = new Decrypter();
		Scanner scn = new Scanner(System.in);
		
		// Declares the variables
		int[] number = new int[4];
		int[] encrypted = new int[4];
		int[] decrypted = new int[4];
		int i, menu;
		
		// Prompts the user to decide between encryption
		// or decryption
		System.out.println("Please enter an option");
		System.out.println("1) Encrypt");
		System.out.println("2) Decrypt");
		
		menu = scn.nextInt();
		
		// If the user wants to encrypt
		if (menu == 1) {
			
			// Prompts the user to input 4 integers
			System.out.println("Please enter 4-digit integer");
			System.out.println("Enter each number on its own line:");
			
			// Loops to scan each integer inputed by the user
			for(i = 0; i < 4; i++) {
				
				// Scans in the value and stores it in an array
				number[i] = scn.nextInt();
				
			}
			
			System.out.println("");
			
			// Runs outside class to encrypt array, returns an int array
			encrypted = enc.encrypt(number);
			
			// Loops to print out the values of the array that was returned
			for (i = 0; i < 4; i++) {
			
				System.out.printf("%d", encrypted[i]);
			
			}
			
		}
		
		// If the user wants to decrypt
		else if (menu == 2) {
			
			// Prompts the user to input 4 integers
			System.out.println("Please enter 4-digit integer");
			System.out.println("Enter each number on its own line:");
						
			// Loops to scan each integer inputed by the user
			for(i = 0; i < 4; i++) {
							
			// Scans in the value and stores it in an array
			number[i] = scn.nextInt();
							
			}
			
			// Runs the decryption class and returns an int array
			decrypted = dec.decrypt(number);
			
			// Displays the returned array
			for (i = 0; i < 4; i++) {
				
				System.out.printf("%d",  decrypted[i]);
				
			}
				
			
			
		}
		
		// For if the user inputs an invalid menu item
		else {
			
			System.out.println("Invalid Entry!");
			
		}
		

	}

}
