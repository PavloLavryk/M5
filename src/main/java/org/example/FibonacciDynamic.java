package org.example;
/*
Просторова складність цього методу є O(n)
Часова складність цього методу є O(n)
 */

public class FibonacciDynamic {


    public static int fib(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        if (n <= 1) {
            return n;
        }

        int[] dp = new int[n + 1];

        dp[0] = 0; // F(0)
        dp[1] = 1; // F(1)

        for (int i = 2; i <= n; i++) {

            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }


    public static void main(String[] args) {

        System.out.println(fib(0)); // 0
        System.out.println(fib(1)); // 1
        System.out.println(fib(6)); // 8
        System.out.println(fib(10)); // 55
    }
}
