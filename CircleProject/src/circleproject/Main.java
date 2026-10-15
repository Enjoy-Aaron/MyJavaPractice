package circleproject;

import java.util.Scanner;
import java.lang.String;
import circleproject.shape.Circle;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double r2 = scanner.nextDouble();
        scanner.close();
        Circle circle1 = new Circle(x1, y1, r1);
        Circle circle2 = new Circle(x2, y2, r2);

        String str1 = String.format("(%.2f, %.2f) - %.2f", circle1.getX(), circle1.getY(), circle1.getRadius());
        String str2 = String.format("(%.2f, %.2f) - %.2f", circle2.getX(), circle2.getY(), circle2.getRadius());

        if (circle1.contains(circle2)) {
            System.out.printf("圆 %s 包含 圆 %s%n", str1, str2);
        } else if (circle2.contains(circle1)) {
            System.out.printf("圆 %s 包含 圆 %s%n", str2, str1);
        } else if (circle1.intersects(circle2)) {
            System.out.printf("圆 %s 与 圆 %s 相交%n", str1, str2);
        } else if (circle1.separates(circle2)) {
            System.out.printf("圆 %s 与 圆 %s 无关%n", str1, str2);
        }
    }
}
