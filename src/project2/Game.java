package project2;

import java.util.Random;
import java.util.Scanner;

public class Game {
    int number;
    int userInput;

public Game(){
    Random random = new Random();
    number = random.nextInt(1,100);
}

public void takeUserInput(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Guess the number between 0-99");
    userInput = sc.nextInt();
}
public boolean isCorrect(){
    if (number==userInput){
        System.out.println("Your Guess is correct. Congratulation!!!");
        return true;
    }
    else if (userInput>number){
        System.out.println("Your Guess is too high, please guess the lower number");
    }
    else if(userInput<number){
        System.out.println("Your guess is too low, please guess the higher number");
    }
    return false;
}
}
