package rocks.zipcode;

import java.util.Scanner;

public class AppEngine {
    public void runGame() {
        Scanner scan = new Scanner(System.in);
        Wordlist gameWord = new Wordlist();

        System.out.println("Please choose a category:");
        String mysteryWord = gameWord.getWord(scan.nextLine());
        System.out.println(mysteryWord);
    }
}
