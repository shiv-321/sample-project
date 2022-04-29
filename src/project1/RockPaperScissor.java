package project1;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Rock, 2 for Paper and 3 for Scissor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(1,4);

        if (userInput==computerInput){
            System.out.println("Game Draw!");
        }
        else if (userInput==1&&computerInput==3 || userInput==2&&computerInput==1 || userInput==3&&computerInput==2){
            System.out.println("Congratulation!! You Win!!!");
        }
        else{
            System.out.println("Computer win!");
        }

        if (computerInput==1){
            System.out.println("Rock");
        }
        else if (computerInput==2){
            System.out.println("Paper");
        }
        else{
            System.out.println("Scissor");
        }
    }

}
