package itmo.lab_7;

public class Main {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing 737");
        Airplane airplane2 = new Airplane("Airbus A320");

        Airplane.Wing wing1 = airplane1.new Wing(1200);
        Airplane.Wing wing2 = airplane2.new Wing(1500);

        airplane1.printModel();
        wing1.printWeight();

        airplane2.printModel();
        wing2.printWeight();
    }
}
