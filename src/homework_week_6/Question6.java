package homework_week_6;

//Java programme to find out area
import java.util.Scanner;

public class Question6 {
    public static void findAreaFromRadius() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = input.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle with radius " + radius + " is " + area);
    }

    public static void main(String[] args) {
        findAreaFromRadius();
    }

}
