import java.util.Scanner;
public class TestData{
  public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input first number: ");
    int num1 = scanner.nextInt();
    
    System.out.println("Input second number:");
    int num2 = scanner.nextInt();
    
    // Assign Variables
    int sum = num1 + num2;
    int minus = num1 - num2;
    int multiply = num1 * num2;
    int divide = num1 / num2;
    int rrum = num1 % num2;
    
    System.out.println(sum);
    System.out.println(minus);
    System.out.println(multiply);
    System.out.println(divide);
    System.out.println(rrum);
  }
}
