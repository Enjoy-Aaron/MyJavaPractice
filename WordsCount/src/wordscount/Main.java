package wordscount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] words = input.split("[,.;! ]+");
        int count = 0;
        String logestWord = "";

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            count++;
            if (word.length() > logestWord.length()) {
                logestWord = word;
            }
        }

        System.out.printf("共有%d个单词，最长的单词是%s", count, logestWord);
        scanner.close();
    }
}
