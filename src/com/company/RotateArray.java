package com.company;

import java.util.*;

public class RotateArray {
    static int t, s;

    public static int[] leftRotate(int arr[], int l1) {
        for (int i = 0; i < l1; i++) {
            if (i + 1 < l1) {
                t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
            }

        }

        return arr;

    }


    public static int[] rightRotate(int arr[], int l1) {
        for (int i = l1 - 1; i > 0; i--) {
            if (i == l1 - 1) {
                s = arr[0];
                arr[0] = arr[i];
                arr[i] = s;
            } else {
                if (i + 1 < l1) {
                    s = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = s;
                }
            }

        }

        return arr;

    }

    public static void main(String args[]) {
        int l1;

        Scanner sc = new Scanner(System.in);
        l1 = sc.nextInt();
        int ansLeft[] = new int[l1];
        int ansRight[] = new int[l1];
        int a[] = new int[l1];
        int b[] = new int[l1];
        for (int i = 0; i < l1; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        ansLeft = leftRotate(a, l1);
        ansRight = rightRotate(b, l1);
        System.out.println("left rotate by 1 " + Arrays.toString(ansLeft));
        System.out.println("rightrotate by 1 " + Arrays.toString(ansRight));
    }
}
