package homework_week_6;

import java.util.Scanner;

public class Question8 {
    public static void areaOfTriangle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter height of triangle (cm): ");
        double height = in.nextDouble();
        System.out.print("Enter base length of triangle (cm): ");
        double baseLength = in.nextDouble();
        double area = 0.5 * height * baseLength;
        System.out.println("Area of triangle with height " + height + "cm and base length " + baseLength + "cm is " + area + "cm^2");
    }

    public static void main(String[] args) {
        areaOfTriangle();
    }
}
