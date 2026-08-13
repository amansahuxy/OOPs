public class App {

    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // Student A = new Student();
        // A.id = 1;
        // A.age = 14;
        // A.name = "Aman";
        // A.nos = 5;
        // System.out.println(A.name);
        // System.out.println(A.age);
        // System.out.println(A.id);
        // System.out.println(A.nos);
        // A.bunk();
        // A.study();
        // A.sleep();

        // parameterized constructor called

        Student A = new Student(1, 12, "Rahul", 3);
        // System.out.println(A.name);
        // System.out.println(A.age);
        // System.out.println(A.id);
        // System.out.println(A.nos);
        // A.bunk();
        // A.study();
        // A.sleep();

        // copy constructor
        Student B = new Student(A);
        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.id);
        System.out.println(B.nos);
        B.sleep();

    }
}
