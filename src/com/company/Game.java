package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    private int noOfGuess;
    private int userInput;
    private int genNo;

    public Game(int guess , int generate){
        this.noOfGuess = guess;
//        this.userInput = 0;
        this.genNo = generate;

        System.out.println("generate by const"+this.genNo);
    }

    public Game(int num){
        this.userInput = num;

    }

    public String res(){
        System.out.println(this.genNo + " " + this.userInput);
        if(this.userInput == this.genNo){
            return "congrats";
        }else if(this.userInput < this.genNo){
            return "your input is less than the number generated.";
        }else{
            return "your input is Greater than the generated number";
        }
//            return "";


    }
}
class GuessTheNumberGame {
    public static void main(String[] args) {


        System.out.println("Enter the number of chances : ");
        Scanner sc1 = new Scanner(System.in);
        int count = sc1.nextInt();

        Random random = new Random();
        int x = random.nextInt(20);
        System.out.println("random no : " +x);

        Game obj = new Game(count,x);


        for(int i =0 ; i < count ; i++){
            System.out.print("Enter a number : ");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

            Game obj1 = new Game(number,x);
            String resultant = obj1.res();

            if(i == count){
                System.out.println("You failed!!. The number was" + x);
                break;
            }else if(resultant.equals("congrats")){
                System.out.println("Congratulations.. The number was : " + x);
                break;
            }else{
                System.out.println(resultant);
                continue;
            }
        }

    }
}