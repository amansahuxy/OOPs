class Student {
    String name;
    int marks;
    int age;

    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.marks);
    }
}

public class op3 {
    public static void main(String[] args) {
        Student s1 = new Student("Aman", 20, 77);
        s1.display();
    }

}
