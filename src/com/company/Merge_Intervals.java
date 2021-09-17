package com.company;

import java.util.*;


public class Merge_Intervals {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num_intervals, start = -1, end = -1, index = -1;

        num_intervals = sc.nextInt();
        int a[][] = new int[num_intervals][2];
        int b[][] = new int[num_intervals][2];
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < num_intervals; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        lst.add(a[0][0]);

        end = a[0][1];
        lst.add(end);
       // {1,3}, {2,4}, {5,7}, {6,8}
       //if all values are sorted in starting interval
        for (int i = 1; i < num_intervals; i++) {
            for (int j = 0; j < 2; j++) {

                if (a[i][j] > end) {
                    lst.add(a[i][j]);

                    end = a[i][j];
                } else if (a[i][j] < end) {

                    index = lst.indexOf(end);

                    lst.remove(index);
                } else {
                    index = lst.indexOf(end);
                    lst.remove(index);

                }

            }

            System.out.println(" ");

        }

        System.out.println(lst);
    }
}
