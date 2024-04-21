package itmo.lab_4;
import java.util.Arrays;
import java.util.Scanner;

import static itmo.lab_4.Exercise.mergeSort;

public class Main {
    public static void main(String[] args){
        Exercise exercise = new Exercise();
        Scanner scanner = new Scanner(System.in);
//Часть 1. Упражнение 1
        System.out.print("Введите начальное число: ");
        int start = scanner.nextInt();
        System.out.print("Введите конечное число (не больше 99): ");
        int end = scanner.nextInt();
        String result = exercise.printOddNumbers(start, end);
        System.out.println(result);
//Часть 1. Упражнение 2
        System.out.print("Введите начальное число: ");
        int start1 = scanner.nextInt();
        System.out.print("Введите конечное число: ");
        int end1 = scanner.nextInt();
        String result1 = exercise.findNumbers(start1, end1);
        System.out.println(result1);
//Часть 1. Упражнение 3
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();
        boolean result2 = exercise.checkSum(num1, num2, num3);
        System.out.println("Результат: " + result2);
//Часть 1. Упражнение 4
        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int thirdNumber = scanner.nextInt();
        boolean result3 = exercise.checkNumbers(firstNumber, secondNumber, thirdNumber);
        System.out.println("Результат: " + result3);
//Часть 1. Упражнение 5
        int[] inputArray = {3, -3, 7, 4, 5, 4, 3};
        boolean result4 = exercise.checkFirstLastElement(inputArray);
        System.out.println("array = " + Arrays.toString(inputArray));
        System.out.println(result4);
//Часть 1. Упражнение 6
        int[] inputArray1 = {0, 2, 4, 1, 5, 6};
        boolean result5 = exercise.checkArray(inputArray1);
        System.out.println("Результат: " + result5);
        System.out.println("Входной массив: " + Arrays.toString(inputArray1));
//Часть 2. Упражнение 1
        int[] inputArray2 = {1, 2, 3, 4, 5};
        String result6 = exercise.checkArraySort(inputArray2);
        System.out.println("Результат: " + result6);
        System.out.println("Входной массив: " + Arrays.toString(inputArray2));
//Часть 2. Упражнение 2
        int[] array = exercise.readArrayFromInput();
        String result7 = exercise.printArray(array);
        System.out.println(result7);
//Часть 2. Упражнение 3
        int[] inputArray3 = {5, 6, 7, 2};
        int[] swappedArray = exercise.swapFirstAndLast(inputArray3);

        System.out.print("Array 1: [");
        for (int i = 0; i < inputArray3.length; i++) {
            System.out.print(inputArray3[i]);
            if (i < inputArray3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Array 2: [");
        for (int i = 0; i < swappedArray.length; i++) {
            System.out.print(swappedArray[i]);
            if (i < swappedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
//Часть 2. Упражнение 4
        int[] array1 = {1, 2, 3, 1, 2, 4};
        int uniqueNumber = exercise.findFirstUniqueNumber(array1);
        System.out.println("Первое уникальное число в массиве: " + uniqueNumber);
//Часть 2. Упражнение 5
        int[] ints = {44, 231, 23, 34, 54, 55, 435, 76, 87, 2, 3};
        int[] result8 = Exercise.mergeSort(ints);
        System.out.println(Arrays.toString(result8));
    }
}
