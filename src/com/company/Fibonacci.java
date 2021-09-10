package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Fibonacci {


    static int s = 0;
    static int fibonacci ( int n ){
        int term = 0;

        if (n > 0) {
            s += s;
            return s + fibonacci(n - 1);
        }
        else {
            return 0;
        }

    }

    public static void main(String[] args)
    {
        int fibonacci = fibonacci(4);
        System.out.println("fibonacci" + fibonacci);

    }





    }






