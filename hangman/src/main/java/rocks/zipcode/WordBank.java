package rocks.zipcode;

import java.util.Arrays;

public class WordBank {
    String[] animeHeroes = {"KAKAROT", "MONKEYDLUFFY", "MIDORIYA", "URAMESHI", "SAKURAGI", "ONIZUKA", "SAITAMA", "JOTARO", "UZUMAKI"};
    String[] basketballLegends = {"JORDAN", "BRYANT", "CURRY", "ONEAL", "IVERSON", "DUNCAN", "BARKLEY", "JAMES", "RODMAN"};
    String[] bestLeagueChamps = {"KAISA", "SAMIRA", "KATARINA", "ASHE", "VAYNE", "SARAHFORTUNE", "JARVANIV", "KHAZIX", "LUCIAN"};
    String[] programLanguages = {"JAVA", "PYTHON", "JAVASCRIPT", "CSHARP", "SWIFT", "CPLUSPLUS", "RUBY", "TYPESCRIPT", "COBRA"};
    char[] hiddenGameState;
    char[] currentGameState;

    public String getWord() {
        int randomChoice = (int) (Math.random() * (8.999999999999 - 0 + 0) + 0);
        String chosenWord = "";
        String userInput = Console.getStringInput("Please select a category:");
        boolean valid = true;

        while(valid) {
            switch (userInput) {
                case "Anime Heroes":
                    chosenWord = animeHeroes[randomChoice];
                    valid = false;
                    break;
                case "Basketball":
                    chosenWord = basketballLegends[randomChoice];
                    valid = false;
                    break;
                case "League of Legends":
                    chosenWord = bestLeagueChamps[randomChoice];
                    valid = false;
                    break;
                case "Program Languages":
                    chosenWord = programLanguages[randomChoice];
                    valid = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a category.");
                    System.out.println("Anime Heroes -- Basketball -- League of Legends -- Program Languages");
                    userInput = Console.getStringInput("");
                    break;
            }
        }
        return chosenWord;
    }

    public char[] initializeGameState() {
        this.hiddenGameState = getWord().toCharArray();
        return this.hiddenGameState;
    }

    public char[] guessArray() {
        this.currentGameState = new char[this.hiddenGameState.length];
        Arrays.fill(this.currentGameState, '_');
        return this.currentGameState;
    }

    public void printCurrentState() {
        System.out.println("Current Guesses:");
        System.out.println(this.currentGameState);
    }

    public boolean isWordGuessed() {
        if(Arrays.equals(this.currentGameState, this.hiddenGameState)) {
            return true;
        } else return false;
    }

}
