package com.company;
import java.util.*;
public class Display_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        String str = new String();
        str = sc.next();

        String s[] = str.split(",");

        HashSet<String> hash_Set = new HashSet<String>();

        for(int i =0 ;i<n ;i++)
        {

            hash_Set.add(s[i]);
        }

        TreeSet<String> arr = new TreeSet<String>(hash_Set);
        arr.forEach(i -> System.out.print(i + " "));

    }
}
