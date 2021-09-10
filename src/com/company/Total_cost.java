package com.company;

import java.util.Scanner;

public class Total_cost {

    public static void main(String[] args)
    {

        int w1 , w2 ;
        float val1 = 18 , val2 =12 ,sum1 =0 , sum2 =0 ,totalArea=0;
        Scanner sc = new Scanner(System.in);
        w1 = sc.nextInt();
        w2 = sc.nextInt();
        float a1[] = new float[w1];
        float a2[] = new float[w2];

        if(w1>0)
        {
            for(int i =0 ;i<w1 ;i++)
            {
                a1[i]=sc.nextFloat();
                sum1 = sum1+a1[i];
            }
        }
        if(w2>0)
        {
            for(int i =0 ;i<w2;i++)
            {
                a2[i]=sc.nextFloat();
                sum2 = sum2+a2[i];

            }
        }


        totalArea = (sum1*val1) + (sum2 *val2);
        System.out.println(totalArea);
    }
}
