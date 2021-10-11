package homework_week_6;

//using two instance variables and method

public class Question1 {
    int a = 16;
    int b = 6;

    public void test() {
        System.out.println(a);//direct access in instance area
        System.out.println(b);//direct access in instance area
    }

    public static void main(String[] args) {
        Question1 q1 = new Question1();// object
        q1.test();
    }
}
