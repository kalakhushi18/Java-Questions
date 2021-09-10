package com.company;
import java.util.*;
public class Series {

    public static void main(String args[])
    {
        int num ,term =0 ;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num==0)
        {
            System.out.println("No term");
        }
       else if(num>=1 && num <=2)
        {
            term =0;
        }

        else if(num%2==0)
        {
            term = (6)*((num-2)/2);

        }
        else if(num%2!=0 )
        {
            term = 7*((num-1)/2);
        }
      System.out.println(term);
    }
}
