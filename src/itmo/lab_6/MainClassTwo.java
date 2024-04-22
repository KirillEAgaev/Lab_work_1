package itmo.lab_6;
import java.util.Scanner;

public class MainClassTwo {
    Scanner scanner;

    public MainClassTwo() {
        this.scanner = new Scanner(System.in);
    }

    public void displayInfo() {
        System.out.println("Введите свой возраст: ");
        int number = scanner.nextInt();
        System.out.println("Возраст: " + number);
    }
}
