package com.generics;

public class MaximumNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Integer a = 25, b = 50, c = 100;
        Float x = 15.2f, y = 15.8f, z = 15.6f;
        String j = "Apple", k = "Peach" , l = "Banana";

        MaximumNumber.getMaximum(a, b, c);
        MaximumNumber.getMaximum(x, y, z);
        MaximumNumber.getMaximum(j, k, l);
    }

    private static <T extends Comparable> void getMaximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum :" + max);
    }
}