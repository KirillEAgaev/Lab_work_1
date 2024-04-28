package itmo.lab_9;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//Упражнение 2
        List<String> listWithDuplicates = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana"));
        Collection<String> listWithoutDuplicates = ExerciseWithCollections.removeDuplicates(listWithDuplicates);

        System.out.println("Список с дубликатоми: " + listWithDuplicates);
        System.out.println("Список без дубликатов: " + listWithoutDuplicates);

//Упражнение 3
        int numberOfElements = 1000000;
        ExerciseWithCollections.addElementsToLists(numberOfElements);

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add(i);
        }

        ExerciseWithCollections.selectElementRandomly(arrayList, 100000);
//Результаты времени выполнения могут различаться, но
// обычно ArrayList будет работать быстрее, чем LinkedList,
// потому что доступ к элементам ArrayList осуществляется по
// индексу за O(1), в то время как доступ к элементу LinkedList
// происходит за O(n).

//Упражнение 4
/* Создайте Map, в котором для каждого пользователя хранится количество очков,
заработанных в какой-то игре (Map<User, Integer>)
   Напишите программу, которая считывает с консоли имя и показывает, сколько
очков у такого пользователя.
   Сами данные можно добавить в Map при создании или сгенерировать случайно.*/
        Map<User, Integer> userScores = new HashMap<>();

        User user1 = new User("Alice");
        User user2 = new User("Bob");
        userScores.put(user1, 100);
        userScores.put(user2, 150);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String userName = scanner.nextLine();

        for (Map.Entry<User, Integer> entry : userScores.entrySet()) {
            User user = entry.getKey();
            if (user.getName().equals(userName)) {
                System.out.println("Пользователь " + user.getName() + " имеет " + entry.getValue() + " очков.");
                return;
            }
        }
        System.out.println("Пользователь не найден.");
    }
}
