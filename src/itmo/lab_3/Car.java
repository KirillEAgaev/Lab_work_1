package itmo.lab_3;

public class Car {
    private String nameCar;
    private String colorCar;
    private double weghtCar;

    public Car() {
    }

    public Car(String colorCar) {
        this.colorCar = colorCar;
    }

    public Car(String colorCar, double weghtCar) {
        this.colorCar = colorCar;
        this.weghtCar = weghtCar;
    }

    public void displayInfoCar() {
        System.out.println("Название машины: " + nameCar);
        System.out.println("Цвет машины: " + colorCar);
        System.out.println("Вес машины: " + weghtCar + " кг");
    }

    public void setName(String nameCar) {
        this.nameCar = nameCar;
    }
}
