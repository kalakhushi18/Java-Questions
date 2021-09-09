package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        mythread.start();

       int p = sum();
        System.out.println("the sum is "+p);
        int fibonacci = fibonacci(4);
        System.out.println("fibonacci"+fibonacci);
	// write your code here
//        System.out.println();//sout
//
       Scanner sc = new Scanner(System.in);
//        int a ,b ;
//        String str ;
//        str= sc.nextLine();
//        System.out.print("enter numbers");
////        a= sc.nextInt();
////        b= sc.nextInt();
////        System.out.println(a+b);
//
//        System.out.println(str);
      //  System.out.println("hello world");
        //first program
//        System.out.println("enter your name");
//        String name = sc.next();
//        System.out.println("hello" + name+"bye ");
//        char a = 'a' ;
//        System.out.println(a--);
//        System.out.println(a);
//        System.out.println(++a);
//        System.out.println(a);

  for(int i = 4 ;i>0 ; i--){
      int j = 0 ;
      System.out.println(" ");
     while(j<i){
         System.out.print("*");
         j++;
     }
  }
  int sum = 0 ;

        for(int r=2 ; r<=10 ; r+=2 ){
            sum +=r ;
        }
        System.out.println("sum is "+sum );

        int [] marks = {1,2,3,4,5};
        System.out.println(marks[0]);

        int []reverse = new int[5];
for(int j =0;j<marks.length;j++){
    reverse[marks.length-(1+j)]=marks[j];

}
        for(int i=0;i<5;i++){
            System.out.println(reverse[i]);
            System.out.println("");
        }

    }

    static void name(){
        System.out.println("helo");
    }
    static int name(int a ){
        return 1 ;
    }

    static int sum(int...arr){
        int total =0;
        for(int i =0;i<arr.length;i++){
            total+=arr[i];
        }
        return total;
    }
    //0 1 1 2 3 5
    static int s =0;
    static int fibonacci(int n ){
        int term = 0 ;

        if(n>0){
            s+=s ;
                return s+fibonacci(n-1);
        }
        else {
            return 0 ;
        }

    }



}


abstract class Heloo{
    abstract public void hello();
}
interface  nameohter{
     int x =0 ;
     private void me(){

     }
}
class Mythread extends Thread{

    public void hello(){
        System.out.println("hello");
    }
}


