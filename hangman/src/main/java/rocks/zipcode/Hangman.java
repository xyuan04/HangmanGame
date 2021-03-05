package rocks.zipcode;

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
        boolean stillInTheGame = true;



        while(gameOn) {
            newGameMessage.announceGame();
            gameWord.initializeGameState();
            gameWord.guessArray();
            playerGuess.guessesRemaining = gameWord.hiddenGameState.length;
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
                    break;
                }

                if (playerGuess.guessesRemaining == 0) {
                    gameWord.printCurrentState();
                    System.out.println(newGameMessage.playerLost());
                    stillInTheGame = false;
                    System.out.println(newGameMessage.lostGame());
                }
            }

            String continueGame = Console.getStringInput("Would you like to play again? (yes/no)");

            while (true) {
                if (continueGame.equals("yes")) {
                    gameOn = true;
                    break;
                } else if (continueGame.equals("no")) {
                    gameOn = false;
                    newGameMessage.gameOver();
                    break;
                } else continueGame = Console.getStringInput("Invalid selection: Would you like to play again? (yes/no)");
            }
        }

    }
}
