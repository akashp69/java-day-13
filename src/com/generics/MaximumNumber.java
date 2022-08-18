package com.generics;

public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Integer a = 25, b = 50, c =100;
        testMaximum (a,b,c);
    }
    private static void testMaximum(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum Number is:" + max);
    }
}