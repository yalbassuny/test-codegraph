package com.test.codegraph;

public class TestDDGCode {
    public static void function() {
        Integer k = 1;
        while (k <= 10) {
            k++;
            System.out.println(k);
        }
        System.out.println(k);
        Integer l = 20;
        k = l;
        System.out.println(k);
    }
}