package itmo.lab_6;

public class Main {
    public static void main(String[] args) {
//Упражнение 1,2
        Client client = new Client("Кирилл", "Агаев", "Сбербанк");
        BankEmployee employee = new BankEmployee("Ирина", "Миронова", "Сбербанк");
        client.displayInfo();
        client.deposit();
        client.withdraw();
        String firstName = client.getFirstName();
        String lastName = client.getLastName();
        System.out.println(firstName);
        System.out.println(lastName);
        employee.displayInfo();
        employee.deposit();
        employee.withdraw();
        String firstName1 = employee.getFirstName();
        String lastName1 = employee.getLastName();
        System.out.println(firstName1);
        System.out.println(lastName1);

//Упражнение 3
        Truck truck = new Truck(5000, "Volvo", 'B', 80, 8, 20000);
        truck.outPut();
        truck.newWheels(12);

//Упражнение 4
        ChildClass child = new ChildClass();
        child.displayNumberFromMain(new MainClass(10));

//Упражнение 5
        MainClassTwo main = new MainClassTwo();
        int age = main.getUserAge();
        System.out.println("Возраст пользователя: " + age);

        ChildClassTwo child1 = new ChildClassTwo();
        String name = child1.getUserName();
        System.out.println("Имя пользователя: " + name);
    }
}
