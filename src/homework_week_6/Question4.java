package homework_week_6;

// Using two instance and two static variables and instance method and static method
public class Question4 {
    int a = 5;
    int b = 10;
    static String name = "Panth";
    static boolean myBoolean = true;

    public void instanceMethod() {
        System.out.println(a);// direct instance access
        System.out.println(b);// direct instance access
        System.out.println(Question4.name);// classname static access
        System.out.println(Question4.myBoolean);// classname static access
    }

    public static void staticMethod() {
        Question4 q4 = new Question4();
        System.out.println(q4.a);// Object access
        System.out.println(q4.b);// Object access
        System.out.println(name);// Direct static access
        System.out.println(myBoolean);// Direct static access
    }

    public static void main(String[] args) {
        Question4 q4 = new Question4(); // Object
        q4.instanceMethod();
        staticMethod();
    }
}
