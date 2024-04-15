package itmo.lab_3;

public class Main {
    public static void main(String[] args) {
        Study study = new Study("Изучение Java - это просто!");
        String studyCourse = study.printCourse();
        System.out.println(studyCourse);

        Car car = new Car("Red", 2000);
        car.setName("Toyota");
        car.displayInfoCar();

        House house1 = new House();
        house1.setInfoHouse(3, 1980, "Каменный дом");
        house1.displayInfoHouse();
        System.out.println("Количество лет с момента постройки: " + house1.calculateYearsFromBuild() + " года");

        House house2 = new House();
        house2.setInfoHouse(5, 2000, "Деревянный дом");
        house2.displayInfoHouse();
        System.out.println("Количество лет с момента постройки: " + house2.calculateYearsFromBuild() + " года");

        Tree tree1 = new Tree();
        System.out.println(tree1);
        Tree tree2 = new Tree(30, "Дуб");
        Tree tree3 = new Tree(5, true, "Клён");
    }//test
}
