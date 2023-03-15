import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter three points of a triangle
        System.out.print("Enter point 1 (x1, y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter point 2 (x2, y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter point 3 (x3, y3): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Calculate the length of each side of the triangle
        double a = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        double b = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
        double c = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));

        // Calculate the semiperimeter of the triangle
        double s = (a + b + c) / 2;

        // Calculate the area of the triangle using Heron's formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Display the area of the triangle
        System.out.println("The area of the triangle is: " + area);
        
    }
}

