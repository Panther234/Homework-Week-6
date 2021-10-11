package homework_week_6;

import java.util.Scanner;

public class Question13 {
    public static void printAverage() {
        Scanner in = new Scanner(System.in);
        double total = 0.0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter number " + i + ": ");
            total += in.nextDouble();
        }

        double count = 3.0;

        System.out.println("The average of the three numbers is " + total/count);
    }

    public static void main(String[] args) {
        printAverage();
    }
}
