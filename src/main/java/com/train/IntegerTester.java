package com.train;

public class IntegerTester {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 10;
        System.out.println(a + "\t" + b);
        integerModifier(a, b);
        System.out.println(a + "\t" + b);

        String s = "abcde";
        System.out.println(s);
        stringModifier(s);
        System.out.println(s);
    }

    private static void integerModifier(Integer a, Integer b) {
        a = 10;
        b = 15;
        System.out.println(a + "\t" + b);
    }

    private static void stringModifier(String ss) {
        ss = "12345";
        System.out.println(ss);
    }

}
