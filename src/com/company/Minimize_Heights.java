package com.company;
import java.util.*;
public class Minimize_Heights {

    public static void main(String args[])
    {
        int k , l ;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        l = sc.nextInt();
        int a[] = new int[l];
        for(int i =0 ;i<l ;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]-k>0)
            {
                a[i]=a[i]-k;
            }
            else
            {
                a[i]=a[i]+k;
            }
        }
        Arrays.sort(a);


        System.out.println( a[l-1]-a[0]);

    }
}
// 8, 1, 5, 4, 7, 5, 7, 9, 4, 6