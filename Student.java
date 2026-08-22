public class Student {
    // Attributes
    public int id;
    private int age;
    public String name;
    public int nos;
    private String gf;

    public String getgf() {
        return this.gf;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int a) {
        // extra layer of authentication
        if (a < 100)
            this.age = a;

        return;
    }

    // deafault ctor
    public Student() {
        System.out.println("Student constructor called");
    }

    // parameterized constructor
    public Student(int id, int age, String name, int nos, String gf) {
        System.out.println("Student parameterized constructor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;

    }

    // copy constructor
    public Student(Student srcobj) { // srcobj->A
        System.out.println("Student copy constructor called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;

    }

    // Methods behaviour
    public void study() {
        System.out.println(name + " Studying");
    }

    public void sleep() {
        System.out.println(name + " Sleeping");
    }

    public void bunk() {
        System.out.println(name + " Bunking");
    }

    // private void gfChatting() {
    // System.out.println(name + " gfChatting");
    // }
}
