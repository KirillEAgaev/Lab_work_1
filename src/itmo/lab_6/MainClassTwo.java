package itmo.lab_6;
import java.util.Scanner;

public class MainClassTwo {
    Scanner scanner;

    public MainClassTwo() {
        this.scanner = new Scanner(System.in);
    }

    public int getUserAge() {
        System.out.println("Введите свой возраст: ");
        int age = scanner.nextInt();
        return age;
    }
}
