package circleproject.shape;

import java.lang.Math;

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle() {
        this.x = 0.0;
        this.y = 0.0;
        this.radius = 1.0;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getDistance(double x1, double y1, double x2, double y2) {
        double distX = x1 - x2;
        double distY = y1 - y2;
        return Math.sqrt(distX * distX + distY * distY);
    }

    public boolean contains(Circle other) {
        double dist = getDistance(this.x, this.y, other.x, other.y);
        return dist + other.radius <= this.radius;
    }

    public boolean intersects(Circle other) {
        double dist = getDistance(this.x, this.y, other.x, other.y);
        double r1 = this.radius;
        double r2 = other.radius;
        return Math.abs(r1 - r2) < dist && dist < r1 + r2;
    }

    public boolean separates(Circle other) {
        return !this.contains(other) && !other.contains(this) && !this.intersects(other);
    }
}
