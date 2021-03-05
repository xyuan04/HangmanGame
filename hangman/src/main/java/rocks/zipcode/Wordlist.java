package rocks.zipcode;

public class Wordlist {
    String[] animeHeroes = {"KAKAROT", "MONKEYDLUFFY", "MIDORIYA", "URAMESHI", "SAKURAGI", "ONIZUKA", "SAITAMA", "JOTARO", "UZUMAKI"};
    String[] basketballLegends = {"JORDAN", "BRYANT", "CURRY", "ONEAL", "IVERSON", "DUNCAN", "BARKLEY", "JAMES", "RODMAN"};
    String[] bestLeagueChamps = {"KAISA", "SAMIRA", "KATARINA", "ASHE", "VAYNE", "SARAHFORTUNE", "JARVANIV", "KHAZIX", "LUCIAN"};
    String[] programLanguages = {"JAVA", "PYTHON", "JAVASCRIPT", "CSHARP", "SWIFT", "CPLUSPLUS", "RUBY", "TYPESCRIPT", "COBRA"};


    public String getWord() {
        int randomChoice = (int) (Math.random() * (8 - 1 + 1) + 1);
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
        return getWord().toCharArray();
    }




//
//    public Character[] initializeCharArray() {
//        String convertWord = getWord(Console.getStringInput("Please choose a category."));
//        Character[] mysteryWord = new Character[convertWord.length()];
//
//        for (int i = 0; i < convertWord.length(); i++) {
//            mysteryWord[i] = convertWord.charAt(i);
//        }
//
//
//        return mysteryWord;
//    }
//
//
//    public String guessWord() {
//        Character[] temp = initializeCharArray();
//        String bank = "";
//
//        for (int i = 0; i < temp.length; i++) {
//            bank += temp[i];
//        }
//        return bank;
//
//    }


}
