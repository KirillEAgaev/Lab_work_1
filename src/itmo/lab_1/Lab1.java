package itmo.lab_1;

import java.util.Scanner;

public class Lab1 {


    public static void main(String[] args) {
/* 1.Выведите строки в следующем порядке:
Я
хорошо
знаю
Java. */
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

/* 2.Посчитайте результат выражения:
( 46 + 10 ) * ( 10 / 3 )
( 29 ) * ( 4 ) * (- 15 ) */
        double number1 = (46 + 10) * ((double) 10 / 3);
        short number2 = (29) * (4) * (-15);
        System.out.println(number1);
        System.out.println(number2);

/* 3.В переменной number, лежит целое число 10500. В переменной result посчитайте следующее
выражение: (number / 10) / 10. Результат выведите на консоль. */
        double number = 10500;
        double result = (number / 10) / 10;
        System.out.println(result);

        /* 4.Даны три числа: 3.6, 4.1, 5.9. В переменной result посчитайте произведение этих чисел. */
        double result1 = 3.6 * 4.1 * 5.9;
        System.out.println(result1);

/* 5.В этой задаче вы должны считать целые числа из стандартного ввода, а затем вывести. Каждое
целое число нужно печатать с новой строки. Формат ввода:
42
100
150 */
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

/* 6.Для целого числа b выполните следующие условные действия:
    ● Если b нечетное, выведите “Нечетное”
    ● Если b четное, выведите “Четное”
    ● Если b четное и больше 100, выведите “Выход за пределы диапазона”
! Использовать класс Scanner: int b = scanner.nextInt(); */
        int b = scanner.nextInt();

        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b <= 100) {
            System.out.println("Четное");
        } else {
            System.out.println("Выход за пределы диапазона");
        }
    }
}
