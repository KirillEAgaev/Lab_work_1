package itmo.lab_3;

public class Tree {
    private int age;
    private boolean isALife;
    private String nameOfTree;

    public Tree(int age, String nameOfTree){
        this.age = age;
        this.nameOfTree = nameOfTree;
    }

    public Tree(int age, boolean isALife, String nameOfTree){
        this.age = age;
        this.isALife = isALife;
        this.nameOfTree = nameOfTree;
    }

    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }
}
