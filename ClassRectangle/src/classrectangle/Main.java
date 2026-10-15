package classrectangle;

import classrectangle.shape.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1=new Rectangle(40, 70);
        System.out.printf("Rect1: width=%.2f, height=%.2f, area=%.2f, perimeter=%.2f\n",
                rect1.getWidth(), rect1.getHeight(), rect1.getArea(), rect1.getPerimeter());
        rect1.setWidth(10.0);
        rect1.setHeight(30.0);
        System.out.printf("Rect1: width=%.2f, height=%.2f, area=%.2f, perimeter=%.2f\n",
                rect1.getWidth(), rect1.getHeight(), rect1.getArea(), rect1.getPerimeter());
        Rectangle rect2=new Rectangle();
        System.out.printf("Rect2: width=%.2f, height=%.2f, area=%.2f, perimeter=%.2f\n",
                rect2.getWidth(), rect2.getHeight(), rect2.getArea(), rect2.getPerimeter());
    }
}