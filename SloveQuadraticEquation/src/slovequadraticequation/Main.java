package slovequadraticequation;

import java.util.Scanner;
import slovequadraticequation.equation.QuadraticEquation;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();

        if (a == 0) {
            System.out.println("不是一元二次方程");
            return;
        }

        QuadraticEquation eq = new QuadraticEquation(a, b, c);
        double delta = eq.getDiscriminant();
        if (delta < 0) {
            System.out.println("方程没有实根");
        } else if (delta < 1e-9) {
            double root = eq.getRoot1();
            System.out.printf("方程有2个相等的实根: %.2f%n", root);
        } else {
            double root1 = eq.getRoot1();
            double root2 = eq.getRoot2();
            System.out.printf("方程有2个不等的实根: %.2f和%.2f%n", root1, root2);
        }
    }
}
