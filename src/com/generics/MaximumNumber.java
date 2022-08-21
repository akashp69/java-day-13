package com.generics;

public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Float a = 15.2f, b= 15.8f, c = 15.6f;

        testMaximum(a, b, c); 	}
    private static void testMaximum(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum num is:" + max);
    }
}