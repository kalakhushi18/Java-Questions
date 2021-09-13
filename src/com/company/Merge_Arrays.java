package com.company;

import java.util.*;

public class Merge_Arrays {

    public static void main(String args[]) {
        int l, n, j = 0, p = 0, temp = 0 ,t=0;

        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        n = sc.nextInt();
        int a[] = new int[l];
        int b[] = new int[n];
        int c[] = new int[l + n];
        for (int i = 0; i < l; i++) {
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();

        }

        //with using extra array
        while (p < l && j < n) {

            if (a[p] < b[j]) {
                c[temp] = a[p];
                p++;
                temp++;
            } else {
                c[temp] = b[j];
                j++;
                temp++;
            }

        }

        if (p < l) {
            for (int k = p; k < l; k++) {
                c[temp] = a[k];
                temp++;
            }
        } else if (j < n) {
            for (int k = j; k < n; k++) {
                c[temp] = b[k];
                temp++;
            }
        }





        for (int k = 0; k < l + n; k++) {
            System.out.print(" "+c[k]);
        }
    }
}
