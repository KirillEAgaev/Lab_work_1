package itmo.lab_9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ExerciseWithCollections {
/*2.Написать метод, который на входе получает коллекцию объектов, а возвращает
    коллекцию уже без дубликатов.
    Для решения этой задачи пригодится Set. */

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        Set<T> set = new HashSet<>(collection);
        return new ArrayList<>(set);
    }

/* 3.Написать метод, который добавляет 1 млн элементов в ArrayList и LinkedList.
Написать метод, который выбирает из заполненного списка элемент наугад
100000 раз. Замерьте время, которое потрачено на это. Сравните результаты,
предположите, почему они именно такие. */

    public static void addElementsToLists(int numberOfElements) {
        List<Integer> arrayList = new ArrayList<>();
        long startTimeArrayList = System.currentTimeMillis();
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add(i);
        }
        long endTimeArrayList = System.currentTimeMillis();
        System.out.println("Время, затраченное на добавление элементов в ArrayList: " + (endTimeArrayList - startTimeArrayList) + " миллисекунды");

        List<Integer> linkedList = new LinkedList<>();
        long startTimeLinkedList = System.currentTimeMillis();
        for (int i = 0; i < numberOfElements; i++) {
            linkedList.add(i);
        }
        long endTimeLinkedList = System.currentTimeMillis();
        System.out.println("Время, затраченное на добавление элементов в LinkedList: " + (endTimeLinkedList - startTimeLinkedList) + " миллисекунды");
    }

    public static void selectElementRandomly(List<Integer> list, int iterations) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            int randomIndex = random.nextInt(list.size());
            int element = list.get(randomIndex);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время, необходимое для случайного выбора элементов: " + (endTime - startTime) + " миллисекунды");
    }


}
