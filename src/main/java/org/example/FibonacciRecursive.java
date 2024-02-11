package org.example;

public class FibonacciRecursive {
/*
Просторова складність цього методу є O(n)
Часова складність цього методу є O(2^n)
 */

    public static int fib(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        if (n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }


    public static void main(String[] args) {

        System.out.println(fib(0)); // 0
        System.out.println(fib(1)); // 1
        System.out.println(fib(6)); // 8
        System.out.println(fib(10)); // 55
    }
}

