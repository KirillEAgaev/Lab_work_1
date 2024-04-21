package itmo.lab_6;
import java.util.Scanner;

public class ChildClassTwo extends MainClassTwo {
    public String getUserName() {
        System.out.println("Введите своё имя: ");
        return scanner.next();
    }
}
