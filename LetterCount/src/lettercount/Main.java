package lettercount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String line;

        while ((line = scanner.nextLine()) != null) {
            if (line.trim().isEmpty()) {
                break;
            }

            int[] lowerOnly = new int[26];
            int[] ignoreCase = new int[26];

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);

                if (c >= 'a' && c <= 'z') {
                    lowerOnly[c - 'a']++;
                }

                if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                    char lower = c;
                    if (c >= 'A' && c <= 'Z') {
                        lower = (char)(c + 32);
                    }
                    ignoreCase[lower - 'a']++;
                }
            }

            char bestLower = findMaxLetter(lowerOnly);
            char bestIgnore = findMaxLetter(ignoreCase);

            System.out.printf(
                    "不忽略大小写: 出现最多的字母是%c, %d次; 忽略大小写: 出现最多的字母是%c, %d次%n",
                    bestLower, lowerOnly[bestLower - 'a'], bestIgnore, ignoreCase[bestIgnore - 'a']
            );
        }
        scanner.close();
    }

    private static char findMaxLetter(int[] count) {
        char best = 'a';
        int max = count[0];
        for (int i = 1; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                best = (char)('a' + i);
            }
        }
        return best;
    }
}
