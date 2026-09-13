package HuiwenNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int reversedNumber = 0;
        int number = input.nextInt();
        int originalNumber = number;
        if(number <= 0) {
            System.out.println("不正确的输入");
            return;
        }
        while(number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }
        if(reversedNumber == originalNumber) {
            System.out.printf("%d是回文整数%n", originalNumber);
        } else {
            System.out.printf("%d不是回文整数%n", originalNumber);
        }
        input.close();
    }
}
