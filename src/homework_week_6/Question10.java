package homework_week_6;

import java.util.Scanner;

public class Question10 {
    public static void printTable() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to see multiplication table of: ");
        int number = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + number*i);
        }
    }

    public static void main(String[] args) {
        printTable();
    }
}
