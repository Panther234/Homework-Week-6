package homework_week_6;

import java.util.Scanner;

public class Question16 {
    public static void addBinaryNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first binary number: ");
        int binaryNumber1 = in.nextInt(2);
        System.out.print("Enter second binary number: ");
        int binaryNumber2 = in.nextInt(2);
        System.out.println("Sum of the two binary numbers: " + Integer.toBinaryString(binaryNumber1 + binaryNumber2));
    }

    public static void main(String[] args) {
        addBinaryNumbers();
    }
}
