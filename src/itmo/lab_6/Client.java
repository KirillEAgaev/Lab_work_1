package itmo.lab_6;

public class Client extends Person implements Bank {
    String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    public void displayInfo() {
        System.out.println("Клиент: " + firstName + " " + lastName + " из " + bankName);
    }

    @Override
    public void deposit() {
        System.out.println(firstName + " " + lastName + " открыл счёт в " + bankName);
    }

    @Override
    public void withdraw() {
        System.out.println(firstName + " " + lastName + " снял деньги со счёта в " + bankName);
    }
}
