package homework_week_6;

import java.util.Scanner;

public class Question17 {

    public static void decimalToBinaryNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int decimal = in.nextInt();
        System.out.println("Binary number is: " + Integer.toBinaryString(decimal));
    }

    public static void main(String[] args) {
        decimalToBinaryNumbers();
    }

}
