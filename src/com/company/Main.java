package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(someMethod (88,22,32,43,45,56,77,23,88,91));}

        static boolean someMethod (int a, int ... arg) {
            for (int b : arg) {
                if (b == a)
                    return true;
            }
            return false;
        }}
