import java.util.Scanner;
public class Arithemetic{

	public static void main(String[] args){
	
	//Initialize new Scanner
	
	Scanner userInput = new Scanner(System.in);
	
	 System.out.println("Enter first number");
	 
	 //Assign varaibles value
	 
	  int firstNumber = userInput.nextInt();
	  
	  System.out.println("Enter second Number");
	  
	  int secondNumber = userInput.nextInt();
	  
	  int sum = firstNumber + secondNumber;
	  
	  System.out.println("The sum of "+ firstNumber +" and "+ secondNumber+" is " + sum);
	  
	  }
	  
	  
	  
	  
}
