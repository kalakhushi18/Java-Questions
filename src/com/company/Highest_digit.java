package com.company;
import java.util.*;
public class Highest_digit {


    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int N,temp =0 ,var =0  ;
        N= sc.nextInt();
        while(N!=0)
        {
            temp = N%10 ;
            if(temp>var)
            {
                var = temp ;
            }
            N= N/10 ;
        }
        System.out.println(var);
    }
}
