package com.company;
import java.util.Scanner;

public class LeapYear {


   public static void main(String[] args){
              int year ;
       System.out.println("enter a year ");
       Scanner sc = new Scanner(System.in);
       year = sc.nextInt();

       if(year%400==0){
           System.out.println("leap year");
       }
       else if (year %100 !=0){
           if(year %4==0){
               System.out.print("leap year");
           }
           else {
               System.out.println("not leap");
           }
       }else {
           System.out.println("not leap ");
       }
   }


}
