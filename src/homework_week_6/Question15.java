package homework_week_6;

import java.util.Scanner;

public class Question15 {
    public static void swapVariables() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = in.nextDouble();
        System.out.print("Enter b: ");
        double b = in.nextDouble();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a and b have been swapped");
        System.out.println("a is now " + a + " and b is now " + b);
    }

    public static void main(String[] args) {
        swapVariables();
    }
}
