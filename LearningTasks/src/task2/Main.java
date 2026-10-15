package task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regex = "\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])";
        String regexMarch = "2025-12-31";
        System.out.println(regexMarch.matches(regex));

//        String exp = sc.nextLine();
//        String s1 = exp.replaceAll("abc", "***");
//        String s2 = exp.replaceAll("abc", "***");
//        System.out.println(s1);

        String s = "java#C++#python-all";
        String[] a1 = s.split("[#-]", -1);
        for (String a : a1) {
            System.out.println(a);
        }


        String regexstr = "a*b";
        Pattern p = Pattern.compile(regexstr);
        Matcher matcher = p.matcher("aaaaabaabaaaabxyz");
        while (matcher.find()) {
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println(matcher.group());
        }

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        StringBuilder sb2 = new StringBuilder("Java");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        sb2.ensureCapacity(30);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        sb2.replace(0, sb2.length()-1, "abc");
        System.out.println(sb2.toString());

//        sc.close();
    }
}
