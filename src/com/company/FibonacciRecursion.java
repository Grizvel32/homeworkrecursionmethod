package com.company;

public class FibonacciRecursion {
    public static int fib(int n){
        int result;
        if(n<=1){
            return n;
        }else {
            result = fib(n - 1) + fib(n - 2);
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }
}
