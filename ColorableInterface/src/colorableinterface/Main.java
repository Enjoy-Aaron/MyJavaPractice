package colorableinterface;

import colorableinterface.shape.Colorable;
import colorableinterface.shape.Circle;
import colorableinterface.shape.Rectangle;

public class Main {
    public static void main(String[] args) {
        // 多态：数组元素统一为 Colorable 类型
        Colorable[] shapes= {
                new Circle(1.0, 2.0, 5.0, "红色"),
                new Rectangle(0.0, 0.0, 10.0, 20.0, "蓝色"),
                new Circle(2.0, 2.0, 15.0, "红色"),
                new Rectangle(4.0, 5.5, 15.0, 25.0, "绿色"),
                new Circle(15.0, 20.0, 15.0, "绿色"),
                new Rectangle(20.0, -3.0, 30.0, 20.0, "黄色"),
        };

        // 调用接口静态方法，批量触发每个元素的 howToColor()
        Colorable.colorShapes(shapes);
    }
}
