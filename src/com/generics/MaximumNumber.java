package com.generics;

public class MaximumNumber <T extends Comparable>{
    T var1, var2, var3;
    public MaximumNumber(T var1, T var2, T var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Integer a = 25, b = 50, c =100;
        Float x = 15.2f, y = 15.8f, z = 15.6f;
        String j = "Apple", k = "Peach" , l = "Banana";

        new MaximumNumber<>(a, b, c).max();
        new MaximumNumber<>(x, y, z).max();
        new MaximumNumber<>(j, k, l).max();
    }

    private void max() {

        MaximumNumber.getMaximum(var1, var2, var3);
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