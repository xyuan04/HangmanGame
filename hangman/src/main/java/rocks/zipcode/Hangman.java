package rocks.zipcode;

import java.util.Arrays;

public class Hangman {
    public boolean gameOn = true;

    public static void main(String[] args) {
        Hangman startApp = new Hangman();

        startApp.runGame();
    }

    public void runGame() {
        WordBank gameWord = new WordBank();
        Message newGameMessage = new Message();
        Guesses playerGuess = new Guesses();
        String secretWord = "";
        boolean stillInTheGame = true;



        while(gameOn) {
            newGameMessage.announceGame();
            gameWord.initializeGameState();
            gameWord.guessArray();
            playerGuess.guessesRemaining = gameWord.hiddenGameState.length;

            for(int i = 0; i < gameWord.hiddenGameState.length; i++) {
                secretWord += gameWord.hiddenGameState[i];
            }

            while(stillInTheGame) {
                gameWord.printCurrentState();
                System.out.println("You have " + playerGuess.guessesRemaining + " tries left.");
                char input = playerGuess.getInput();
                for (int i = 0; i < gameWord.hiddenGameState.length; i++) {
                    if (input == gameWord.hiddenGameState[i]) {
                        gameWord.currentGameState[i] = input;
                    }
                }
                playerGuess.useGuess();
                System.out.println(playerGuess.guessesRemaining);



                if (gameWord.isWordGuessed()) {
                    gameWord.printCurrentState();
                    System.out.println(newGameMessage.playerWon());
                    stillInTheGame = false;
                    System.out.println(newGameMessage.beatGame());
                    secretWord = "";
                    break;
                }

                if (playerGuess.guessesRemaining == 0) {
                    gameWord.printCurrentState();
                    System.out.println(newGameMessage.playerLost());
                    System.out.println("The secret word was " + secretWord);
                    stillInTheGame = false;
                    System.out.println(newGameMessage.lostGame());
                    secretWord = "";
                }
            }

            String continueGame = Console.getStringInput("Would you like to play again? (yes/no)");

            while (true) {
                if (continueGame.equals("yes")) {
                    gameOn = true;
                    stillInTheGame = true;
                    break;
                } else if (continueGame.equals("no")) {
                    System.out.println(newGameMessage.gameOver());
                    gameOn = false;
                    break;
                } else continueGame = Console.getStringInput("Invalid selection: Would you like to play again? (yes/no)");
            }
        }
    }
}
