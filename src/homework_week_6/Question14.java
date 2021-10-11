package homework_week_6;

import java.util.Scanner;

public class Question14 {
    public static void areaAndPerimeterOfRectangle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Width (cm): ");
        double width = in.nextDouble();
        System.out.print("Length (cm): ");
        double length = in.nextDouble();
        double area = width * length;
        double perimeter = 2 * (width + length);
        System.out.println("Area is " + width + " * " + length + " = " + area );
        System.out.println("Perimeter is (" + width + " + " + length + ") * 2 = " + perimeter);
    }

    public static void main(String[] args) {
        areaAndPerimeterOfRectangle();
    }
}
