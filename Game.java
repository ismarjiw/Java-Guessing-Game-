import java.util.Scanner; 
import java.util.Random;

/** A number guessing game. */
public class Game {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");

    Scanner input = new Scanner(System.in);

    // Get user's name
    System.out.println("Enter your name:");
    String name = input.nextLine();
    // Test that everything works
    System.out.println(
      name + ", I'm thinking of a number between 0 and 100."
      );

    Random rand = new Random(); 

    int number = rand.nextInt(101); 

    System.out.println("Guess the number I'm thinking");

    Scanner guess = new Scanner(System.in);
    int guessedNumber = guess.nextInt();

    boolean gameOver = false;
    int trys = 1;

    while (gameOver == false){

      if(guessedNumber == number){
        System.out.println("You got it right!");
        System.out.println("It took you " + trys + "attempt(s) to guess the number right!");
        gameOver = true;
      }
      else if(guessedNumber > number){
        System.out.println("Your guess " + guessedNumber + " is too high. Try again.");
        guessedNumber = guess.nextInt();
        trys += 1;
      }
      else{
        System.out.println("Your guess " + guessedNumber + " is too low. Try again.");
        guessedNumber = guess.nextInt();
      }
    }

  }
}
