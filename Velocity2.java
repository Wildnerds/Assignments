import java.util.Scanner;

	public class Velocity2 {
	
	public static void man(String[] args) {
	
	// Initialize a new Native instance of the java class
	
	Scanner input = new Scanner(System.in);
	
	// Declare datatypes of variables
	
	System.out.println("Enter v0, v1 and t: ");
	double v0 = input.nextDouble();
	double v1 = input.nextDouble();
	double t = input.nextDouble();
	
	// Calculate the average Acceleration
	
	double a = (v0 - v1) / t;
	
	// Display result
	
	System.out.println ( "The average acceleration is" + a); 
	}
	}	
	
