package homework_week_6;

//using two static variables and method

public class Question2 {
    static String name = "Panth";
    static int a = 16;


    public static void panther() {
        System.out.println(a); // direct access
        System.out.println(name); // direct access
        //System.out.println(Question2.a);//Classname access
        //System.out.println(Question2.name);//Classname access
    }

    public static void main(String[] args) {
        panther();
    }
}
