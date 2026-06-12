class Student {
    String name;
    int marks;
    int age;

}

public class op1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 20;
        s1.marks = 75;

        System.out.println(s1.name);
        System.out.println(s1.age);

    }
}