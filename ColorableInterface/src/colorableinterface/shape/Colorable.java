package colorableinterface.shape;

public interface Colorable {
    void howToColor();

    static void colorShapes(Colorable[] shapes) {
        for (Colorable shape : shapes) {
            shape.howToColor();
        }
    }
}
