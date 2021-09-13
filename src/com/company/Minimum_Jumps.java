package com.company;
import java.util.* ;
public class Minimum_Jumps {

    public static void main(String args[])
    {

        int l,jumps=0 ,s=0 ,length_done;
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        length_done = l;
        int a[] = new int[l];
        for(int i =0 ;i<l ;i++)
        {
            a[i]=sc.nextInt();
        }

        while(s<l)
        {
           if(a[s]==0 && length_done !=0)
           {
             System.out.println(-1);
             break ;
           }
           else if(a[s]==0 && length_done ==0)
           {
               System.out.println(jumps);
               break ;
           }
           else if(length_done==1 || length_done<=0)
            {
                System.out.println(jumps);
                break ;

            }
           else if(a[s]>0)
           {
               jumps ++;


               length_done = length_done-a[s];
               s=s+a[s];
               if(length_done==1 || length_done<=0)
               {
                   System.out.println(jumps);
                   break ;
               }
           }

        }
    }
}

