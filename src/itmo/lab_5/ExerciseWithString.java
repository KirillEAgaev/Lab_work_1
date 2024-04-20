package itmo.lab_5;

public class ExerciseWithString {
//1.Написать метод для поиска самого длинного слова в тексте.

    public String findLongestWord(String text){
        String longestWord = "";
        String[] words = text.split("\\s+"); // разбиваем текст на слова

        for(int i = 0; i < words.length; i++){
            if(words[i].length() > longestWord.length()){
                longestWord = words[i];
            }
        }

        return longestWord;
    }

//2.Написать метод, который проверяет является ли слово палиндромом.

    public boolean isPalindrome(String word){
        word = word.toLowerCase(); // приводим слово к нижнему регистру для удобства сравнения

        int left = 0;
        int right = word.length() - 1;

        while(left < right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

//3.Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».

    public String replaceBadWord(String text){
        return text.replaceAll("бяка", "[вырезано цензурой]");
    }

//4.Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.

    public int countOccurrences(String str, String subStr){
        int count = 0;
        int lastIndex = 0;

        while(lastIndex != -1){
            lastIndex = str.indexOf(subStr, lastIndex);
            if(lastIndex != -1){
                count++;
                lastIndex += subStr.length();
            }
        }

        return count;
    }

//5.Напишите метод, который инвертирует слова в строке. Предполагается, что в
//строке нет знаков препинания, и слова разделены пробелами.
//Sample Output:
//The given string is: This is a test string
//The string reversed word by word is:
//sihT si a tset gnirts

    public String reverseWords(String str){
        String[] words = str.split(" ");
        StringBuilder reversedStr = new StringBuilder();

        for(int i = 0; i < words.length; i++){
            String word = words[i];
            StringBuilder reversedWord = new StringBuilder();

            for(int j = word.length() - 1; j >= 0; j--){
                reversedWord.append(word.charAt(j));
            }

            if(i == words.length-1){
                reversedStr.append(reversedWord.toString());
            } else {
                reversedStr.append(reversedWord.toString()).append(" ");
            }
        }

        return reversedStr.toString();
    }
}
