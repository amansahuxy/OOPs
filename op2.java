class Student {
    String name;
    int marks;
    int age;

    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);

    }

}

public class op2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 20;
        s1.marks = 75;

        s1.display();
        Student s2 = new Student();
        s2.name = "Rohit";
        s2.age = 42;
        s2.marks = 87;
        s2.display();

    }
}