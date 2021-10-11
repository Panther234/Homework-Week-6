package homework_week_6;

//using one instance and one static variable and method

public class Question3 {
    int a = 10;
    static String name = "Panther";

    public void instanceMethod() {
        System.out.println(a);//direct access in instance area
        System.out.println(name);//direct access in instance area
    }

    public static void staticMethod() {
        Question3 q3 = new Question3();//object
        System.out.println(q3.a);//Object access
        System.out.println(name);//Classname  access
    }

    public static void main(String[] args) {
        staticMethod(); //direct access
        //System.out.println(Question3.name);//access with class name
        Question3 q3 = new Question3();//object
        q3.instanceMethod();
    }
}
