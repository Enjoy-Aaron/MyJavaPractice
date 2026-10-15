package task1;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str1 = "abc"; // "abc"成为规范对象
        char[] data = new char[] {'a', 'b', 'c'};
        String str2 = new String(data); // 基于字符数组创建
        String str3 = str2.intern(); // 返回内容为"abc"的规范对象
        System.out.println(str1 == str3); // 输出 true
        System.out.println(str2 == str3); // 输出 false
        String str4 = new String(new char[] {'x', 'y', 'z'});
        String str5 = str4.intern(); // 常量池无"xyz", str4引用的字符串成为规范对象
        System.out.println(str4 == str5); // 输出 true
    }
    private static  void print(String str) {
        System.out.println(str);
    }
}
