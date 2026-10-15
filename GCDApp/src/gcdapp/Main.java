package gcdapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        if (!input.hasNextInt()) {
            System.out.println("不正确的输入");
            input.close();
            return;
        }
        int numA = input.nextInt();

        if (!input.hasNextInt()) {
            System.out.println("不正确的输入");
            input.close();
            return;
        }
        int numB = input.nextInt();

        if (numA <= 0 || numB <= 0) {
            System.out.println("不正确的输入");
            input.close();
            return;
        }

        while (numB != 0) {
            int numTemp = numA % numB;
            numA = numB;
            numB = numTemp;
        }

        System.out.println(numA);
        input.close();
        return;
    }
}
