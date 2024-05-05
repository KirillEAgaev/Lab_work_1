package itmo.lab_10;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ExerciseWithFiles {

//1.Написать метод, который читает текстовый файл и возвращает его в виде списка строк.

    public static List<String> readTextFile(String filePath) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }

        return lines;
    }

//2.Написать метод, который записывает в файл строку, переданную параметром.

    public static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

//3.Используя решение 1 и 2, напишите метод, который склеивает два текстовых файла в один.

    public static void mergeFiles(String file1Path, String file2Path, String outputFilePath) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1Path));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2Path))) {

            String line;
            while ((line = reader1.readLine()) != null) {
                content.append(line).append("\n");
            }

            while ((line = reader2.readLine()) != null) {
                content.append(line).append("\n");
            }

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файлов: " + e.getMessage());
        }

        ExerciseWithFiles.writeToFile(outputFilePath, content.toString());
    }

//4.Написать метод который заменяет в файле все кроме букв и цифр на знак ‘$’

    public static void processFile(String filePath) {
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(filePath.replace(".txt", "-processed.txt"))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String processedLine = replaceNonAlphanumeric(line);
                fileWriter.write(processedLine + System.lineSeparator());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String replaceNonAlphanumeric(String line) {
        return line.replaceAll("[^a-zA-Z0-9]", "\\$");
    }

}
