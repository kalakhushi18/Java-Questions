package com.company;

import java.util.*;

public class Unionntersection {
    public static void main(String args[]) {
        int l1, l2;
        System.out.println("Print values");
        Scanner sc = new Scanner(System.in);
        l1 = sc.nextInt();
        l2 = sc.nextInt();
        boolean val = false;
        int a[] = new int[l1];
        int b[] = new int[l2];
        ArrayList<Integer> uni = new ArrayList<>();
        ArrayList<Integer> inter = new ArrayList<>();
        for (int i = 0; i < l1; i++) {
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < l2; i++) {
            b[i] = sc.nextInt();

        }

        //union

        for (int i = 0; i <= l1; i++) {


            if (i < l1) {
                uni.add(a[i]);
            } else {
                if (l1 > l2) {
                    for (int k = 0; k < l1; k++) {
                        for (int j = 0; j < l2; j++) {
                            if (a[k] == b[j]) {
                                val = true;
                                inter.add(a[k]);
                                break;
                            }
                        }
                        if (!val) {
                            uni.add(a[k]);
                        } else {
                            System.out.println(k);

                        }

                    }
                } else if (l2 > l1) {


                    for (int k = 0; k < l2; k++) {

                        for (int j = 0; j < l1; j++) {
                            if (a[j] == b[k]) {
                                val = true;
                                inter.add(b[k]);
                                break;
                            } else {
                                val = false;

                            }

                        }
                        if (!val) {

                            uni.add(b[k]);
                        }

                    }
                } else {
                    for (int k = 0; k < l1; k++) {
                        for (int j = 0; j < l2; j++) {
                            if (a[k] == b[j]) {
                                val = true;
                                inter.add(a[k]);
                                break;
                            }
                        }
                        if (!val) {
                            uni.add(b[k]);
                        } else {
                            System.out.println(k);

                        }

                    }
                }
            }


        }
        System.out.println(uni);
        System.out.println(inter);

    }


}
