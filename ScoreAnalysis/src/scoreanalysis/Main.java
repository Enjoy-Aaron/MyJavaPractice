package scoreanalysis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int classCount = scanner.nextInt();
        double[][] scores = new double[classCount][];

        for (int i = 0; i < classCount; i++) {
            int studentCount = scanner.nextInt();
            scores[i] = new double[studentCount];
            for (int j = 0; j < studentCount; j++) {
                scores[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();

        double totalSum = 0.0;
        int totalCount = 0;
        double courseMax = -1.0;
        double courseMin = 101.0;

        for (int i = 0; i < classCount; i++) {
            double sum = 0.0;
            double max = -1.0;
            double min = 101.0;

            for (double score : scores[i]) {
                sum += score;
                if (score > max) {
                    max = score;
                }
                if (score < min) {
                    min = score;
                }
            }

            double avg = sum / scores[i].length;
            System.out.printf("平均分: %.2f, 最高分: %.2f, 最低分: %.2f%n", avg, max, min);

            totalSum += sum;
            totalCount += scores[i].length;
            if (max > courseMax) {
                courseMax = max;
            }
            if (min < courseMin) {
                courseMin = min;
            }
        }

        double courseAvg = totalSum / totalCount;
        System.out.printf("课程数据, 平均分: %.2f, 最高分: %.2f, 最低分: %.2f%n", courseAvg, courseMax, courseMin);
    }
}
