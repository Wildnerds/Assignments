import java.util.Scanner;

public class NewFeets {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a value for feet: ");
    double feet = input.nextDouble();

    double meters = feetToMeters(feet);

    System.out.println(feet + " feet is " + meters + " meters");
  }//from www .j  av  a  2s . c  om

  private static double feetToMeters(double feet) {
    return feet * 0.305;
  }
}
