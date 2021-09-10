package com.company;

import java.util.*;

public class Negative_Move {

    public static void main(String[] args) {
        int num, t = 0, temp;


        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int a[] = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            if (a[i] < 0) {
                temp = a[t];
                a[t] = a[i];
                a[i] = temp;
                t++;
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(a[i]);
        }


    }

}
