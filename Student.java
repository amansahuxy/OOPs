public class Student {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    // deafault ctor
    public Student() {
        System.out.println("Student constructor called");
    }

    // Methods behaviour
    public void study() {
        System.out.println(name + "Studying");
    }

    public void sleep() {
        System.out.println(name + "Sleeping");
    }

    public void bunk() {
        System.out.println(name + "Bunking");
    }
}
