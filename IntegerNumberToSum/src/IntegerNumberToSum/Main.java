package IntegerNumberToSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers = input.nextInt();
        if (numbers < 2) {
            System.out.println("不正确的个数");
            return;
        }
        int pivotNumber = input.nextInt();
        long numbersSum = 0;
        for (int i = 0; i < numbers - 1; i++) {
            int solvedNumber = input.nextInt();
            if(solvedNumber < pivotNumber) {
                numbersSum += solvedNumber;
            }
        }
        System.out.println(numbersSum);
        input.close();
    }
}
