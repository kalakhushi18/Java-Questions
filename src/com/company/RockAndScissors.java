package com.company;
import java.util.Scanner;
import java.util.Random;
public class RockAndScissors {

    public static void main(String[] args) {
        int input,other,total_points=0,player_point=0 ;
        System.out.println("Choose a number from following : ");
        System.out.println("0: Stone");
        System.out.println("1: Scissors");
        System.out.println("2: Paper");

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        other = random.nextInt(3);
        System.out.println(random.nextInt(3));

        if(other==0){
            System.out.println("other");
        }
         else {

             if(input == other){
                 System.out.println("no points");
             }
             else {
                 switch (input){
                     case 0 : {
                         if(other ==2){
                         System.out.println("you won");
                         total_points+=1 ;
                         System.out.println("total points = "+total_points);
                         System.out.println("other player points"+player_point);
                     }
                     else {
                         System.out.println("you lost");
                        player_point+=1 ;
                         System.out.println("total your points"+total_points);
                         System.out.println("other player points"+player_point);
                     }
                 }
                 break;
                     case 1 : {
                        if(other == 1){
                            System.out.println("you lost");
                            player_point+=1;
                            System.out.println("total points = "+total_points);
                            System.out.println("other player points"+player_point);
                        }
                        else {
                            System.out.println("you won ");
                            total_points+=1 ;
                            System.out.println("total points = "+total_points);
                            System.out.println("other player points ="+player_point);
                        }
                     }
                     break;
                     case 2 : {
                         if(other ==1 ){
                             System.out.println("you won ");
                             total_points+=1 ;
                             System.out.println("total points "+ total_points);
                             System.out.println("other player points ="+player_point);
                         }
                         else {
                             System.out.println("you lost");
                             player_point-=1;
                             System.out.println("total points "+ total_points);
                             System.out.println("other player points ="+player_point);
                         }
                     }
                     break ;
                     default:
                         System.out.println("wrong choice ");
                 }
             }
        }
    }
}
