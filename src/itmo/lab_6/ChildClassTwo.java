package itmo.lab_6;

public class ChildClassTwo extends MainClassTwo {
    @Override
    public void displayInfo() {
        System.out.println("Введите своё имя: ");
        String name = scanner.next();
        System.out.println("Имя: " + name);
    }
}
