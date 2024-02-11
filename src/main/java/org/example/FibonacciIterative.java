package org.example;
public class FibonacciIterative {


/*
Просторова складність цього методу є O(1)
Часова складність цього методу є O(n)
 */
    public static int fib(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        if (n <= 1) {
            return n;
        }

        int a = 0; // F(0)
        int b = 1; // F(1)

        int c = 0;

        for (int i = 2; i <= n; i++) {

            c = a + b;

            a = b;
            b = c;
        }

        return c;
    }


    public static void main(String[] args) {

        System.out.println(fib(0)); // 0
        System.out.println(fib(1)); // 1
        System.out.println(fib(6)); // 8
        System.out.println(fib(10)); // 55
    }
}
