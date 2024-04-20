package itmo.lab_5;

public class Main {
    public static void main(String[] args){
//Упражнение 1
        ExerciseWithString exercise = new ExerciseWithString();
        String text = "Привет мир, это тестовый текст";

        String longestWord = exercise.findLongestWord(text);
        System.out.println("Самое длинное слово в тексте: " + longestWord);

//Упражнение 2
        String word = "радар"; // пример слова-палиндрома

        if(exercise.isPalindrome(word)){
            System.out.println(word + " является словом полиндромом.");
        } else {
            System.out.println(word + " не является словом полиндромом.");
        }

//Упражнение 3
        String text1 = "Этот текст содержит слово бяка. Еще раз бяка!";

        String censoredText = exercise.replaceBadWord(text1);
        System.out.println("Исходный текст: " + text1);
        System.out.println("Текст с заменой цензурных слов: " + censoredText);

//Упражнение 4
        String str = "привет, привет мир, привет"; // основная строка
        String subStr = "привет"; // подстрока для поиска

        int occurrences = exercise.countOccurrences(str, subStr);
        System.out.println("Количество вхождений подстроки в строку: " + occurrences);

//Упражнение 5
        String inputString = "This is a test string";

        System.out.println("The given string is: " + inputString);
        String reversedString = exercise.reverseWords(inputString);
        System.out.println("The string reversed word by word is:");
        System.out.println(reversedString);
    }
}
