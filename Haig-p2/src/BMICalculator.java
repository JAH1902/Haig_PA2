// Jeffrey "Alex" Haig
// COP 3330
// 2/1/2020

// Programming Assignment 2 / Problem 2

// A program which will input which unit type the user is using, input weight and height
// of the patient, and calculate the patient's bmi and whether that bmi is healthy.

// Imports the classes that will be used
import java.util.Scanner;
import java.lang.Math;

public class BMICalculator {
    
    // Declares the instance variables
    private static double bmi;
    private static int unit;
    private static double weight;
    private static double height;
    private static int bmiCat;
    
    // Main application method
    public static void main(String[] args) {
        
        // Method will input what unit type the user is using and will input the
        // weight and height from the user and store the values in instance variables
        readUserData();
        
        // If statement will end the program if the user inputs a negative number in
        // any instance variable
        if (getHeight() < 0 || getWeight() < 0) {
            
            System.exit(0);
            
        }
        
        // Method will use the instance variables and unit type to calculate the BMI
        // of the patient
        calculateBMI();
        
        // Method will use the BMI instance variable and BMI limits given by NHI to \
        // determine what category the patient falls into: underweight, healthy, overweight
        // or obese.
        calculateBMICategory();
        
        // Displays the BMi and BMI Category that was calculated to the user
        displayBMI();
        
        
    }
    
    // Method will input what unit type the user is using and will input the
    // weight and height from the user and store the values in instance variables
    public static void readUserData() {
        
        // Welcomes the user and prompts the user to choose the unit type
        System.out.println("Welcome to the BMI Calculator!");
        System.out.println("Please select the option for the Unit's of Measurement");
        System.out.println("(Input must be a positive integer listed)");
        System.out.println("1) Metric System (meters, kilograms");
        System.out.println("2) Imperial System (inches, pounds");
        
        // Method will read what unit type the user inputs
        readUnitType();
        
    }
    
    // Method will read in what unit type the user inputs
    private static void readUnitType() {
        
        // Sets up the scanner object and variable
        Scanner inp = new Scanner(System.in);
        int menu;
        
        // Scans in the option the user inputs
        menu = inp.nextInt();
        
        // If statement will run if the user inputs Metric Units
        if (menu == 1) {
            
            // Sets the unit instance variable to 1
            unit = 1;
            
        }
        
        // If statement will run if the user inputs Imperial Units
        else if(menu == 2) {
            
            // Sets the unit instance variable to 2
            unit = 2;
            
        }
        
        // If statement that will run if the user inputs an option not listed
        else {
            
            // Tells the user that it wasn't an option and goes back to the beginning
            System.out.println("Error!  Selection must be an option listed");
            readUserData();
            
        }
        
        // Method will read in the values the user will input
        readMeasurementData();
        
    }
    
    // Method will read in the values of weight and height
    private static void readMeasurementData() {
        
        // If statement will run if the user selected Metric units
        if (unit == 1) {
            
            // Method that will read in the metric units
            readMetricData();
            
        }
        
        // If statement will run if the user selected Imperial units
        else if (unit == 2) {
            
            // Method that will read in the imperial units
            readImperialData();
            
        }
        
        // If statement just in case an error occured
        else {
            
            // Displays the error message and will restart
            System.out.println("Error!");
            readUnitType();
            
        }
        
    }
    
    // Method will read in the metric units inputted by the user
    private static void readMetricData() {
        
        // Declares the variables and scanner objects
        double weigh = 0;
        double heigh = 0;
        Scanner in = new Scanner(System.in);
        
        // While loop will run until the user enters a positive number
        while (weigh == 0) {
            
            // Prompts the user to input patient's weight
            System.out.println("Please enter the patient's weight in kilograms:");
            weigh = in.nextDouble();
            
            // Method will set the instance variable's value
            setWeight(weigh);
            
            // If statement will run if the user inputs a negative value
            if (weigh < 0) {
                
                // Informs the user of the error
                System.out.println("Invalid weight!  Must be a positive number.");
                
            }
            
            // If statement will run if the user inputs a positive value
            else {
                
                // Breaks out of the loop
                break;
                
            }
            
        }
        
        // While loop that will run until the user inputs a positive number
        while (heigh <= 0) {
            
            // Prompts the user to input the patient's height
            System.out.println("Please enter the patient's height in meters:");
            heigh = in.nextDouble();
            
            // Method that will set the height instance variable
            setHeight(heigh);
            
            // If statement that will run if the user inputs a negative number
            if (heigh < 0) {
                
                // Displays the error
                System.out.println("Invalid height!  Must be a positive number.");
                
            }
            
            // If statement that will run if the user inputs a positive number
            else {
                
                // Breaks out of the loop
                break;
                
            }
            
        }
        
    }
    
    // Method that will read in the Imperial units inputted by the user
    private static void readImperialData() {
        
        // Declares the variables and scanner object
        double weigh = 0;
        double heigh = 0;
        Scanner in = new Scanner(System.in);
        
        // While loops will run until user inputs a positive number
        while (weigh  <= 0) {
            
            // Prompts the user to input the patient's weight
            System.out.println("Please enter the patient's weight in pounds:");
            weigh = in.nextDouble();
            
            // Method that will set the weight instance variable
            setWeight(weigh);
            
            // If statement that will run if the user inputs a negative number
            if (getWeight() < 0) {
                
                // Displays the error and terminates the program
                System.out.println("Invalid weight!  Must be a positive number.");
                System.exit(0);
                
            }
            
            // If statement that run if the user inputs a positive number
            else {
                
                // Breaks out of the loop
                break;
                
            }
            
        }
        
        // While loops that runs until the user inputs a positive weight
        while (heigh <= 0) {
            
            // Prompts the user to input the patient's height
            System.out.println("Please enter the patient's height in inches:");
            heigh = in.nextDouble();
            
            // Method will set the height instance variable
            setHeight(heigh);
            
            // If statement that will run if the height is a negative number
            if (heigh < 0) {
                
                // Informs the user of the error and terminates the program
                System.out.println("Invalid height!  Must be a positive number.");
                System.exit(0);
                
            }
            
            // If statement that will run if the user inputs a positie number
            else {
                
                // Breaks out of the loop
                break;
                
            }
            
        }
        
    }
    
    
    // Method will calculate the patient's BMI based on the unit type and instance variables
    public static void calculateBMI() {
        
        // Declares the variable
        double index = 0;
        
        // If statement will run if the user selected metric units
        if (unit == 1) {
            
            // Calculates the BMI based on the formula given
            index = (getWeight()) / (Math.pow(getHeight(), 2));
            
        }
        
        // If statement will run if the user selected imperial units
        else if (unit == 2 ) {
            
            // Calculates the BMI based on the formula given
            index = (703 * getWeight()) / (Math.pow(getHeight(), 2));
            
        }
        
        // If statement will run if there was an error
        else {
            
            System.out.println("Error!");
            
        }
        
        // Sets the BMI instance variable's value to that which was calculated
        bmi = index;
        
    }
    
    // Method will determine, based on the calculated BMI, which category the patient
    // falls under
    private static void calculateBMICategory() {
        
        // If statement will run if the patient is underweight
        if (getBmi() < 18.5) {
            
            bmiCat = 1;
            
        }
        
        // If statement will run if the patient has a healthy weight
        else if (getBmi() >= 18.5 && getBmi() <= 24.9) {
            
            bmiCat = 2;
            
        }
        
        // If statement will run if the patient is overweight
        else if (getBmi() >= 25 && getBmi() <= 29.9) {
            
            bmiCat = 3;
            
        }
        
        // If statement will run if the patient is obese
        else {
            
            bmiCat = 4;
            
        }
        
    }
    
    // Method will display the BMI and BMI category calculated
    public static void displayBMI() {
        
        // Displays the BMI calculated earlier
        System.out.printf("Patient's BMI is %.2f. \n", bmi);
        
        // If statement will run if the patient is underweight
        if (getBmiCategory() == 1) {
            
            System.out.println("The patient's BMI suggests he/she is underweight.");
            
        }
        
        // If statement will run if the patient is a normal weight
        else if (getBmiCategory() == 2) {
            
            System.out.println("The patient's BMI suggests he/she has a healthy weight.");
            
        }
        
        // If statement will run if the patient is overweight
        else if (getBmiCategory() == 3) {
            
            System.out.println("The patient's BMI suggests he/she is overweight.");
            
        }
        
        // If statement will run if the patient is obese
        else {
            
            System.out.println("The patient's BMI suggests he/she is suffering from obesity.");
            
        }
        
    }
    
    // Method will return the Weight instance variable's value
    public static double getWeight() {
        
        return weight;
        
    }
    
    // Method will set the Weight instance variable to the input
    private static void setWeight(double w) {
        
        weight = w;
        
    }
    
    // Method will return the Height instance variable's value
    public static double getHeight() {
        
        return height;
        
    }
    
    // Method will set the Height instance variable to the input
    private static void setHeight(double h) {
        
        height = h;
        
    }
    
    // Method will return the BMI instance variable's value
    public static double getBmi() {
        
        return bmi;
        
    }
    
    // Method will return the BMI category instance variable
    public static double getBmiCategory() {
        
        return bmiCat;
        
    }
    
}
