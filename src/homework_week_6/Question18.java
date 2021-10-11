package homework_week_6;

import java.util.Scanner;

public class Question18 {
    public void Operation(){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.println("Output: ");

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " mod " + b + " = " + (a % b));
    }

    public static void main(String[] args) {
        Question18 q18 = new Question18();
        q18.Operation();
    }
}
