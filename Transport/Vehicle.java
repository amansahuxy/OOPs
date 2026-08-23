package Transport;

public class Vehicle {
    public String name;
    public String model;
    public int noOfTyres;

    Vehicle() {
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }

    Vehicle(String name, String model, int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void startEngine() {
        System.out.println("Engine is starting");
    }

    void stopEngine() {
        System.out.println("Engine is stopping");
    }
}
