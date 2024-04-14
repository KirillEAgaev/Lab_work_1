package itmo.lab_3;
import java.util.Calendar;

public class House {
    private int floorNumbers;
    private int yearOfBuild;
    private String nameOfHouse;

    public void setInfoHouse(int floorNumbers, int yearOfBuild, String nameOfHouse) {
        this.floorNumbers = floorNumbers;
        this.yearOfBuild = yearOfBuild;
        this.nameOfHouse = nameOfHouse;
    }

    public void displayInfoHouse() {
        System.out.println("Количество этажей в доме: " + floorNumbers);
        System.out.println("Год постройки: " + yearOfBuild);
        System.out.println("Название дома: " + nameOfHouse);
    }

    public int calculateYearsFromBuild() {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        return currentYear - yearOfBuild;
    }
}
