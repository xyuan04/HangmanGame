package rocks.zipcode;

public class Message {

    public void announceGame() {
        System.out.println("Hi, Welcome to a game of Hangman");
        System.out.println("Anime Heroes -- Basketball -- League of Legends -- Program Languages");
    }

    public void printCurrentState() {
    }

    public String gameOver() {
        return "Game Over";
    }

    public String playerWon() {
        return "*** *** ***";
    }

    public String playerLost() {
        return ":-( :-( :-(";
    }
}
