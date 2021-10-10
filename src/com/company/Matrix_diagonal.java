package com.company;

import java.util.* ;

public class Matrix_diagonal {

public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int N ,rightSum=0 , leftSum=0 ,diff =0 ;
    N = sc.nextInt();
    int arr[][] = new int[N][N];
    for(int i =0 ;i<N ;i++)
    {
        for(int j =0 ;j<N ;j++)
        {
            arr[i][j]=sc.nextInt();

        }
    }
    for(int i =0 ;i<N ;i++)
    {
        for(int j =0 ;j<N ;j++)
        {


            if(i==j)
            {
                rightSum = rightSum + arr[i][j];

            }
            if((i+j)==N-1)
            {
                leftSum = leftSum + arr[i][j];

            }
        }

    }
System.out.println(rightSum);
    System.out.println(leftSum);
    if(rightSum>leftSum)
    {
        diff = rightSum-leftSum;
    }
    else
    {
        diff = leftSum - rightSum;
    }

    System.out.println(diff);



}

}
