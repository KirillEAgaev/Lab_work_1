package itmo.lab_11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args){
//Упражнения 1-2
        ExerciseWithMultithreading.printNumbers();

//Упражнение 3
        /*3.Дан класс:
class Counter {
     int count = 0;

    public void increment() {
        count = count + 1;
    }
    public int getCount() {
     return count;
}
}

  Напишите программу, в которой запускается 100 потоков, каждый из которых
вызывает метод increment() 1000 раз.
После того, как потоки завершат работу count должен быть равен 100000 при  каждом
запуске программы .
Если обнаружилась проблема, предложите ее решение.*/
        Counter counter = new Counter();

        ExecutorService executor = Executors.newFixedThreadPool(100);

        for (int i = 0; i < 100; i++) {
            executor.submit(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
            });
        }

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
            System.out.println("Окончательный подсчет после завершения всех потоков: " + counter.getCount());
        } catch (InterruptedException e) {
            System.err.println("Произошло исключение во время ожидания завершения потоков: " + e.getMessage());
        }

           /*4.Напишите программу, в которой создаются два потока, каждый из которых выводит
по очереди на консоль своё имя.
Начать можно с написания своего класс-потока, который выводит в бесконечном
цикле свое имя. Потом придется добавить синхронизацию с помощью wait() и
notify().*/
//Упражнение 4
        Object lock = new Object();
        MyThread thread1 = new MyThread("Поток1", lock);
        MyThread thread2 = new MyThread("Поток2", lock);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();

        // Остановка потоков через 5 секунд
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.stopThread();
        thread2.stopThread();
    }
}
