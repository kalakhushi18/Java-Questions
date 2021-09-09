package com.company;

import java.util.Scanner;

public class Calculate_marks {

    public static void main(String[] args) {
        System.out.println("enter 5 subjects number");
        Scanner sc = new Scanner(System.in);
        float total_marks =0;
        for(int i =0 ;i<5 ;i++){
            float a = sc.nextFloat();
            total_marks+=a ;
//            System.out.println(total_marks);
        }
   //     System.out.println(total_marks);
        System.out.println((total_marks/500));
    }
}
