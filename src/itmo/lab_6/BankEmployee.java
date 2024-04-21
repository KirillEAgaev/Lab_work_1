package itmo.lab_6;

public class BankEmployee extends Person implements Bank {
    String bankName;

    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    public void displayInfo() {
        System.out.println("Сотрудник банка: " + firstName + " " + lastName + " из " + bankName);
    }

    @Override
    public void deposit() {
        System.out.println(firstName + " " + lastName + " открыла счёт для клиента в " + bankName);
    }

    @Override
    public void withdraw() {
        System.out.println(firstName + " " + lastName + " сняла деньги со счёта для клиента в " + bankName);
    }
}
