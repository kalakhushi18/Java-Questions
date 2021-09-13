package com.company;
import java.util.*;
public class Kadanes_Algo {


    public static void main(String args[])
    {
        int l ,sum=0 ,max =Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        int a[] = new int[l];
        for(int i =0 ;i<l; i++)
        {
            a[i]= sc.nextInt();
        }
        for(int i =0 ;i<l ;i++)
        {
            sum +=a[i];
            if(sum>max)
            {
                max = sum ;
            }
            else if(sum<0)
            {
                sum =0 ;
            }
        }
        System.out.println(max);
    }

}
