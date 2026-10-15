package numberPairsFind;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfNumbers = scanner.nextInt();
        if (countOfNumbers < 2) {
            System.out.println("不正确的输入");
            scanner.close();
            return;
        }

        Set<Integer> uniqueNumbers = new TreeSet<>();
        for (int i = 0; i < countOfNumbers; ++i) {
            int currentNumber = scanner.nextInt();
            uniqueNumbers.add(currentNumber);
        }

        List<int[]> resultPairList = new ArrayList<>();

        for (int num : uniqueNumbers) {
            int doubleNum = num * 2;
            if (uniqueNumbers.contains(doubleNum)) {
                resultPairList.add(new int[]{num,  doubleNum});
            }
        }

        for (int[] pair : resultPairList) {
            System.out.println(pair[0] +  " " + pair[1]);
        }
        System.out.println("数对个数: " + resultPairList.size());

        scanner.close();
    }
}
