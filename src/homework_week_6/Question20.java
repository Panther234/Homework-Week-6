package homework_week_6;

public class Question20 {
    public void printReceipt() {
        System.out.println("\"+------------------------+\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"|      CORNER STORE      |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"| 2015-03-29  04:38PM    |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"| Gallons:       10.870  |\"");
        System.out.println("\"| Price/gallon: $ 2.089  |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"| Fuel total: $ 22.71    |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"+------------------------+\"");
    }

    public static void main(String[] args) {
        Question20 q20 = new Question20();
        q20.printReceipt();
    }
}
