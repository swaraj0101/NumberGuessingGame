import java.util.Random;

import java.util.Scanner;

public class NumberGuessingGame {

  public static void main(String[] args) {

    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);

    int randomNumber = rand.nextInt(100) + 1;
    
    int tryCount = 0;

    while (true) {

      System.out.println("Enter your guess number in between 1 to 100 :");

      int playerGuess = scanner.nextInt();
      tryCount++;

      if (playerGuess == randomNumber) 
      {

        System.out.println("CORRECT!! You win!!");
        System.out.println("It took you " + tryCount + " trys");
        break;

      } 

      else if (randomNumber > playerGuess)
      {

        System.out.println("The number is Higher.\n Again Guess another Number");

      }

       else
       {

        System.out.println("The number is Lower. \n Again Guess another Number");

       }
    }
  }
}