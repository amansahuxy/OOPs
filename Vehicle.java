
public class Vehicle {

    public String name;
    public String model;
    public int noOfTyers;

    Vehicle() {
        this.name = "";
        this.model = "";
        this.noOfTyers = -1;
    }

    Vehicle(String name, String model, int noOfTyers) {
        this.name = name;
        this.model = model;
        this.noOfTyers = noOfTyers;

    }

    void startEngine() {
        System.out.println("Engine is starting");
    }

    void stopEngine() {
        System.out.println("Engine is stopping");
    }
}
