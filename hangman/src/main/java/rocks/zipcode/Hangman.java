package rocks.zipcode;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Hangman {
    static char[] currentGameState;

    public static void main(String[] args) {
        Hangman startApp = new Hangman();
        Message newGameMessage = new Message();
        Wordlist gameWord = new Wordlist();

        newGameMessage.announceGame();
        startApp.runGame();
        System.out.println(currentGameState);
        System.out.println(newGameMessage.playerWon());
        System.out.println(newGameMessage.playerLost());
        System.out.println(newGameMessage.gameOver());
    }

    public void runGame() {
        Scanner scan = new Scanner(System.in);
        Wordlist gameWord = new Wordlist();

        currentGameState = gameWord.initializeGameState();
        guessArray();

    }

    public char[] guessArray() { ;
        Arrays.fill(currentGameState, '_');
        return currentGameState;
    }

}
