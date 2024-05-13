package itmo.lab_11;

public class ExerciseWithMultithreading {
    //Задание на многопоточность
//1.Напишите программу, в которой запускается 10 потоков и каждый из них выводит
//числа от 0 до 100.
//2.Выведете состояние потока перед его запуском, после запуска и во время
//выполнения.

    public static void printNumbers() {
        for (int i = 0; i < 10; i++) {
            int threadNumber = i;
            Thread thread = new Thread(() -> {
                System.out.println("Поток " + threadNumber + " в состоянии перед запуском: " + Thread.currentThread().getState());
                for (int j = 0; j <= 100; j++) {
                    System.out.println("Поток " + threadNumber + ": " + j);
                }
            });
            System.out.println("Поток " + threadNumber + " в состоянии после запуска: " + thread.getState());
            thread.start();
            System.out.println("Поток " + threadNumber + " во время выполнения: " + thread.getState());
        }
    }

}
