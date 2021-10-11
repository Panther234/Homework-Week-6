package homework_week_6;

import java.util.Scanner;

public class Question7 {
    public void convertFahrenheitToCelsius() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature (°F): ");
        double fahrenheit = in.nextDouble();

        // Key variables
        double a = 32.0;
        double b = 5.0;
        double c = 9.0;

        double asCelsius = (fahrenheit - a) * b/c;
        System.out.println(fahrenheit + "°F = " + asCelsius + "°C");
    }

    public static void main(String[] args) {
        Question7 Degree = new Question7();
        Degree.convertFahrenheitToCelsius();
    }
}
