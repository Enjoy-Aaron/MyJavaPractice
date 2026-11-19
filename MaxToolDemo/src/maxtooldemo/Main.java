package maxtooldemo;

public class Main {
    public static void main(String[] args) {
        int n1=MaxTool.max(10, 20);
        int n2=MaxTool.max(10, 20, 30);
        int n3=MaxTool.max(10, 20, 30, 40, 50);
        double d=MaxTool.max(3.14, 1.1, 6.28, 11.0);
        String s=MaxTool.max("Java", "Python", "C++", "Rust");
        System.out.printf("%d,%d,%d,%f,%s\n", n1, n2, n3, d, s);
    }
}