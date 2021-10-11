package homework_week_6;

import java.util.Scanner;

// calculator
public class Question5 {

    // Static method
    public static double add(double a, double b) {
        return a + b;
    }

    // Static method
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Instance method
    public double multiply(double a, double b) {
        return a * b;
    }

    // Instance method
    public double divide(double a, double b) {
        return a / b;
    }

    // Using string concatenation
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = in.nextDouble();
        System.out.print("Enter value of b: ");
        double b = in.nextDouble();

        double additionResult = add(a,b); // Add a and b with static add method
        System.out.println("The addition of "+"a + b = " + additionResult);

        double subtractionResult = subtract(a,b); // Subtract a and b with static subtract method
        System.out.println("a - b = " + subtractionResult);

        Question5 q5 = new Question5(); // Object

        double multiplicationResult = q5.multiply(a,b); // Multiply a and b with instance multiply method
        System.out.println("a * b = " + multiplicationResult);

        double divisionResult = q5.divide(a,b); // Divide a and b with instance divide method
        System.out.println("a/b = " + divisionResult);
    }
}
