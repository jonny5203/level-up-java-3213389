package com.linkedin.javacodechallenges;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {

  private int points = 10;

  public void playGame() {
    // User start with 10
    Random rand = new Random();
    boolean gameIsOn = true;
    Scanner input = new Scanner(System.in);
    while(gameIsOn){
      boolean result = rand.nextBoolean();
      System.out.println("Enter 1 to play and 0 to quit");
      int userChoice = input.nextInt();
      if(userChoice == 1){
        if (result) {
          points *= 2;
          System.out.println("You won, and your points now is: " + points);
        } else {
          points = 0;
          System.out.println("You lost, your current points is 0");
          gameIsOn = false;
        }
      } else if(userChoice == 0){
        System.out.println("Thank you for playing, your points is" + points);
        System.out.println("Hope to see you again");
        gameIsOn = false;
      }else{
        System.out.println("Invalid input, please reenter");
      }
    }

  }
}