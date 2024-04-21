package itmo.lab_6;

public class Truck extends Car {
    public int numberOfWheels;
    public int maxWeight;

    public void newWheels(int newWheels) {
        this.numberOfWheels = newWheels;
        System.out.println("Количество колес: " + numberOfWheels);
    }

    public Truck(int w, String m, char c, float s, int wheels, int maxWeight) {
        super(w, m, c, s);
        this.numberOfWheels = wheels;
        this.maxWeight = maxWeight;
    }
}
