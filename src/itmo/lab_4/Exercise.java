package itmo.lab_4;
import java.util.Scanner;

public class Exercise {
    //Часть 1
//1.Напишите программу, которая выводит на консоль нечетные числа от 1 до 99.
// Каждое число печатается с новой строки.
    public void Exercise1(){
        for(int i=1; i<100; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
//2.Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на
// то и другое (то есть и на 3 и на 5). Пример вывода:
//Делится на 3: ….
//Делится на 5: ….
//Делится на 3 и на 5: ….

    public void Exercise2(){
        for(int i=1; i<=100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("Делится на 3 и на 5: " + i);
            } else if (i%3 == 0) {
                System.out.println("Делится на 3: " + i);
            } else if (i%5 == 0) {
                System.out.println("Делится на 5: " + i);
            }
        }
    }
//3.Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true, если
// сумма равна третьему целому числу. Пример вывода:
//Введите первое число: 5
//Введите второе число: 10
//Введите третье число: 15
//Результат: true

    public void Exercise3(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        boolean result = checkSum(num1, num2, num3);
        System.out.println("Результат: " + result);
    }

    public static boolean checkSum(int num1, int num2, int num3) {
        return num1 + num2 == num3;
    }
//4.Напишите программу, которая принимает от пользователя три целых числа и
// возвращает true, если второе число больше первого числа, а третье число больше
//второго числа. Пример вывода:
//Введите первое число: 5
//Введите второе число: 10
//Введите третье число: 15
//Результат: true

    public void Exercise4(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int thirdNumber = scanner.nextInt();

        boolean result = secondNumber > firstNumber && thirdNumber > secondNumber;
        System.out.println("Результат: " + result);
    }
//5.Напишите программу, чтобы проверить, появляется ли число 3 как первый или
// последний элемент массива целых чисел. Длина массива должна быть больше или
//равна двум. Пример вывода:
//array = 3, -3, 7, 4, 5, 4, 3
//true

    public void Exercise5(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве (больше или равно двум): ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Длина массива должна быть больше или равна двум.");
            return;
        }

        int[] array = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        boolean result = array[0] == 3 || array[n - 1] == 3;

        System.out.println("Результат: " + result);
    }
//6.Напишите программу, чтобы проверить, что массив содержит число 1 или 3.

    public void Exercise6() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        checkArray(array);
    }

    public static void checkArray(int[] array) {
        boolean containsOneOrThree = false;

        for (int num : array) {
            if (num == 1 || num == 3) {
                containsOneOrThree = true;
                break;
            }
        }
        System.out.println("Результат: " + containsOneOrThree);
    }

    //Часть 2
//1.Напишите программу, которая проверяет отсортирован ли массив по
//возрастанию. Если он отсортирован по возрастанию то выводится “OK”, если нет,
//то будет выводиться текст “Please, try again”.

    public void Exercise7(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов в массиве: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        boolean sorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }


    //2.Напишите программу, которая считывает с клавиатуры длину массива (например,
    //пользователь вводит цифру 4), затем пользователь вводит 4 числа и на новой
    //строке выводится массив из 4 элементов. Пример вывода:
    //   Array length: 4
    //   Numbers of array:
    //   5
    //   6
    //   7
    //   2
    //   Result: [5, 6, 7, 2]

    public void Exercise8(){
        int[] array = readArrayFromInput();
        printArray(array);
    }

    public int[] readArrayFromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array length: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Numbers of array:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public void printArray(int[] array) {
        System.out.print("Result: [");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + "]");
            }
        }
    }

//3.Напишите метод, который меняет местами первый и последний элемент массива.
//Пример вывода:
//Array 1: [5, 6, 7, 2]
//Array 2: [2, 6, 7, 5]

    public void Exercise9(){
        int[] array = {5, 6, 7, 2};
        int[] swappedArray = swapFirstAndLast(array);
        printArray("Array 1", array);
        printArray("Array 2", swappedArray);
    }

    public int[] swapFirstAndLast(int[] array) {
        if (array.length >= 2) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        }
        return array;
    }

    public void printArray(String label, int[] array) {
        System.out.print(label + ": [");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + "]");
            }
        }
        System.out.println();
    }

//4.Дан массив чисел. Найдите первое уникальное в этом массиве число.
//Например, для массива [1, 2, 3, 1, 2, 4] это число 3.

    public void Exercise10(){
        int[] array = {1, 2, 3, 1, 2, 4};
        int uniqueNumber = findFirstUniqueNumber(array);
        System.out.println("Первое уникальное число в массиве: " + uniqueNumber);
    }

    public int findFirstUniqueNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return array[i];
            }
        }
        return -1; // Если уникальные значения не найдены
    }
}
