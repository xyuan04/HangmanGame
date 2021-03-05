package rocks.zipcode;

import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        Hangman startApp = new Hangman();

        startApp.runGame();
    }

    public void runGame() {
        Scanner scan = new Scanner(System.in);
        Wordlist gameWord = new Wordlist();
        Message newGameMessage = new Message();
        Guesses playerGuess = new Guesses();

        newGameMessage.announceGame();
        gameWord.initializeGameState();
        gameWord.guessArray();
        System.out.println(gameWord.currentGameState.length);
        playerGuess.guessesRemaining = gameWord.currentGameState.length;
        System.out.println(playerGuess.guessesRemaining);
        playerGuess.useGuess();
        playerGuess.useGuess();
        playerGuess.useGuess();
        System.out.println(playerGuess.guessesRemaining);
        System.out.println(gameWord.hiddenGameState);
        System.out.println(gameWord.currentGameState);
        gameWord.printCurrentState();
        gameWord.printCurrentState();


    }



}
