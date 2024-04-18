package itmo.lab_4;
import java.util.Scanner;

public class Exercise {
    //Часть 1
//1.Напишите программу, которая выводит на консоль нечетные числа от 1 до 99.
// Каждое число печатается с новой строки.
    public String printOddNumbers(int start, int end) {
        StringBuilder result = new StringBuilder();
        for(int i = start; i <= end; i++){
            if(i % 2 != 0){
                result.append(i).append("\n");
            }
        }
        return result.toString();
    }
//2.Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на
// то и другое (то есть и на 3 и на 5). Пример вывода:
//Делится на 3: ….
//Делится на 5: ….
//Делится на 3 и на 5: ….

    public String findNumbers(int start, int end) {
        StringBuilder result = new StringBuilder();
        for(int i = start; i <= end; i++){
            if(i % 3 == 0 && i % 5 == 0){
                result.append("Делится на 3 и на 5: ").append(i).append("\n");
            } else if (i % 3 == 0) {
                result.append("Делится на 3: ").append(i).append("\n");
            } else if (i % 5 == 0) {
                result.append("Делится на 5: ").append(i).append("\n");
            }
        }
        return result.toString();
    }
//3.Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true, если
// сумма равна третьему целому числу. Пример вывода:
//Введите первое число: 5
//Введите второе число: 10
//Введите третье число: 15
//Результат: true

    public boolean checkSum(int num1, int num2, int num3) {
        return num1 + num2 == num3;
    }
//4.Напишите программу, которая принимает от пользователя три целых числа и
// возвращает true, если второе число больше первого числа, а третье число больше
//второго числа. Пример вывода:
//Введите первое число: 5
//Введите второе число: 10
//Введите третье число: 15
//Результат: true

    public boolean checkNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        return secondNumber > firstNumber && thirdNumber > secondNumber;
    }
//5.Напишите программу, чтобы проверить, появляется ли число 3 как первый или
// последний элемент массива целых чисел. Длина массива должна быть больше или
//равна двум. Пример вывода:
//array = 3, -3, 7, 4, 5, 4, 3
//true

    public boolean checkFirstLastElement(int[] array){
        if (array.length < 2) {
            System.out.println("Длина массива должна быть больше или равна двум.");
            return false;
        }

        return array[0] == 3 || array[array.length - 1] == 3;
    }
//6.Напишите программу, чтобы проверить, что массив содержит число 1 или 3.

    public boolean checkArray(int[] array) {
        boolean containsOneOrThree = false;

        for (int num : array) {
            if (num == 1 || num == 3) {
                containsOneOrThree = true;
                break;
            }
        }

        return containsOneOrThree;
    }

    //Часть 2
//1.Напишите программу, которая проверяет отсортирован ли массив по
//возрастанию. Если он отсортирован по возрастанию то выводится “OK”, если нет,
//то будет выводиться текст “Please, try again”.

    public String checkArraySort(int[] array) {
        boolean sorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            return "OK";
        } else {
            return "Please, try again";
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

    public String printArray(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("Result: [");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

//3.Напишите метод, который меняет местами первый и последний элемент массива.
//Пример вывода:
//Array 1: [5, 6, 7, 2]
//Array 2: [2, 6, 7, 5]

    public int[] swapFirstAndLast(int[] array) {
        if (array.length >= 2) {
            int[] newArray = array.clone();
            int temp = newArray[0];
            newArray[0] = newArray[newArray.length - 1];
            newArray[newArray.length - 1] = temp;
            return newArray;
        }
        return array;
    }

//4.Дан массив чисел. Найдите первое уникальное в этом массиве число.
//Например, для массива [1, 2, 3, 1, 2, 4] это число 3.

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
