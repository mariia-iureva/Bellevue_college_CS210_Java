// CS210 Summer 2021 Assignment #5 "GuessingGame"
// Mariia Iureva
// Guessing Game picks a random integer between 1 and 100 (inclusive), 
// then it accepts guesses from the user until the user guesses the number correctly. 
// After each incorrect guess, the program if the next guess should be 
// higher or lower. The game ends after the right guess
// and the program reports how many guesses were made.

import java.util.*;

public class GuessingGame {

    public static void main(String[] args) {
    
        Scanner cs = new Scanner(System.in);
        boolean endGame = false;
        int totalGames = 0;
        int totalGuesses = 0;
        int bestGame = 0;
      
        do {
            System.out.println("I'm thinking of a number between 1 and 100...");
            int numberOfGuesses = guessingGame(cs);
            totalGames++;
            totalGuesses += numberOfGuesses;
            bestGame = compareGames(bestGame, numberOfGuesses);

            System.out.print("Play again?");
            String answer = cs.next();

            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                System.out.println();
            } else {
                endGame = true;
            }
        }while(endGame != true);  
      
        resultPrintOut(totalGames,totalGuesses, bestGame);
      
    }
  
    public static int guessingGame(Scanner cs){
        
    // the main method that keeps asking for a guess till the guess 
    // matches the random number. Then returns number of guesses in this game
    
        Random randomizer = new Random();
        int randomNum = randomizer.nextInt(100) + 1;
        int guess;
        int guessCounter = 0;
        do{        
            System.out.println("Your guess? ");
            guess = cs.nextInt();
            
    //compare the guess with random number and tells if its higher or lower        
            if (guess < randomNum){
                System.out.println("It's higher.");
            } else if( guess > randomNum) {
                System.out.println("It's lower.");
            }
    //count guesses in current game        
            guessCounter++;
          
       }while (guess !=randomNum);
       System.out.println("You guessed it in " + guessCounter + " guesses!");
      
       return guessCounter;
    }
  
    public static int compareGames(int currentBestGame, int newNumOfGuesses){
    
    // Determines the best game with the lowest number of guesses. 
    // The lowest number of guesses it took is the best game, and returned
    // to the best game integer.
    // currentBestGame : The current best game. 
    // If it is 0, it is automatically replaced with newNumOfGuesses
    // newNumOfGuesses : current games number of guesses it took to find number.
    
        int bestGame = 0;

        if(currentBestGame == 0){
            bestGame = newNumOfGuesses;
        }else if(newNumOfGuesses < currentBestGame){
            bestGame = newNumOfGuesses;
        }else{
            bestGame = currentBestGame;
        }
        return bestGame;
    }
  

    public static void resultPrintOut( int totalGames, int totalGuesses, int bestGame){
        
    // Prints out the results of the guessing games after the user is done.
    // totalGames : Total number of games played.
    // totalGuesses : Total number of guesses over all games played
    // bestGame : lowest number of guesses for a game.
    
        System.out.println();
        System.out.println("Your overall results:");
        System.out.println("Total games = " + totalGames);
        System.out.println("Total guesses = " + totalGuesses);
        System.out.println("Guesses/game = " + (double)totalGuesses / (double)totalGames);
        System.out.println("Best game = " + bestGame);
    }
}