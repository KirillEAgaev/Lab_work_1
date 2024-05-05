package itmo.lab_10;

import java.util.List;

public class Main {
    public static void main(String[] args){
//Упражнение 1
        List<String> textLines = ExerciseWithFiles.readTextFile("files/text.txt");

        // Выводим содержимое файла на консоль
        for (String line : textLines) {
            System.out.println(line);
        }

//Упражнение 2
        String content = "Это строка, которую записываем в файл";
        ExerciseWithFiles.writeToFile("files/text.txt", content);
        System.out.println("Строка успешно записана в файл 'output.txt'");

//Упражнение 3
        ExerciseWithFiles.mergeFiles("files/file1.txt", "files/file2.txt", "files/output.txt");
        System.out.println("Файлы успешно объединены в файл 'output.txt'");

//Упражнение 4
        String filePath = "files/inputFile.txt";
        ExerciseWithFiles.processFile(filePath);
        System.out.println("Символы, отличные от букв и цифр, заменены на '$' в файле 'inputFile.txt'");
    }
}
