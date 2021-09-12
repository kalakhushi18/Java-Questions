package com.company;
import java.util.*;
public class Missing_Duplicate {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n ,count=0 ,sum=0 ,sum1 =0 ,sq=0 , sq1 =0 ,const1=0 , const2=0 ,div=0 ,missing=0,duplicate=0,temp,s=0;
        boolean ans =false ;
        n=sc.nextInt();
        int a[] = new int[n];
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> dupl = new ArrayList<>();
        for(int i =0 ;i<n;i++)
        {
            a[i]= sc.nextInt();
            sum1+=a[i];
            sq1 +=(a[i]*a[i]);

        }
        for(int i =1 ;i<=n ;i++)
        {
            sum +=i;
            sq +=(i*i);
        }
        //one missing and one duplicate value in sorted array
//        const1 = sum-sum1 ;
//        const2 = sq-sq1;
//        div = const2/const1;
//        missing = (div+const1)/2;
//        duplicate = missing-const1;




        while(s<n)
        {
            if(a[s]!=a[a[s]-1])
            {
                temp = a[s];
                a[s]=a[a[s]-1];
                a[a[s]-1]=temp;


                }
                else
                    {
                       s++ ;
                    }




        }
        for(int i =0 ;i<n ;i++)
        {
            if(a[i] !=i+1 )
            {
                missing = i+1 ;
                duplicate = a[i];
            }
        }

        System.out.println(missing+" $ "+duplicate);













    
        //array not sorted
//        for(int i = 1 ;i<=n ;i++)
//        {
//            for(int j =0 ;j<n;j++)
//            {
//                if(i==a[j])
//                {
//                    ans =true ;
//                    continue;
//
//                }
//                if(i!=n)
//                {
//                    if(a[i-1]==a[j])
//                    {
//                        System.out.println(a[i]);
//
//                        dupl.add(a[i]);
//                    }
//                }
//            }
//            if(!ans)
//            {
//                arr.add(i);
//
//            }
//            ans =false ;
//
//        }
//     System.out.println(arr);
//     System.out.println(dupl);




    }

}
