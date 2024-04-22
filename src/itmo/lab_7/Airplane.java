package itmo.lab_7;

public class Airplane {
    private String model;
    private Wing wing;

    public Airplane(String model) {
        this.model = model;
    }

    public void printModel() {
        System.out.println("Airplane model: " + model);
    }

    public class Wing {
        private double weight;

        public Wing(double weight) {
            this.weight = weight;
        }

        public void printWeight() {
            System.out.println("Wing weight: " + weight + " kg");
        }
    }
}
