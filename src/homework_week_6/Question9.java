package homework_week_6;

import java.util.Scanner;

public class Question9 {
    public static void upperCaseToLowerCase() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text to convert into lower case: ");
        String text = in.nextLine();
        System.out.println(text.toLowerCase());
    }

    public static void main(String[] args) {
        upperCaseToLowerCase();
    }
}
