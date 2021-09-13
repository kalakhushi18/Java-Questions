package com.company;
import java.util.*;
public class Contiguous_subarray {
    public static void main(String args[])
    {
        int sum=0 ,maxx=-1, l ;
        Scanner sc = new Scanner(System.in);
        l= sc.nextInt();
        int a[] = new int[l];
        for(int i =0 ;i<l;i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i =0 ;i<l-1;i++)
        {
            sum=a[i];
            for(int j =i+1 ;j<l;j++)
            {
                sum +=a[j];
                if(sum>=maxx)
                {
                    maxx= sum ;
                }
            }

        }
        System.out.println(maxx);
    }


}
