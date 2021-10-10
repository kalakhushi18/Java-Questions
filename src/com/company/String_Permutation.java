package com.company;

import java.util.* ;
public class String_Permutation {

public static void main(String args[])
{
    String str = new String();
    Scanner sc = new Scanner(System.in);
    str= sc.next();

    HashSet<Character> set = new HashSet<Character>();
    StringBuffer stringBuffer = new StringBuffer();
    Random rand = new Random();
    int num ;
    char ch[] = new char[str.length()];
    ch= str.toCharArray();

        for(int i =0 ;i<str.length();i++)
        {
            num = rand.nextInt(1);
           stringBuffer.append(ch[num]);
        }


System.out.println(stringBuffer);


}

}
