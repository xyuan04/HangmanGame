package rocks.zipcode;

public class Wordlist {
    String[] animeHeroes = {"KAKAROT", "MONKEYDLUFFY", "MIDORIYA", "URAMESHI", "SAKURAGI", "ONIZUKA", "SAITAMA", "JOTARO", "UZUMAKI"};
    String[] basketballLegends = {"JORDAN", "BRYANT", "CURRY", "ONEAL", "IVERSON", "DUNCAN", "BARKLEY", "JAMES", "RODMAN"};
    String[] bestLeagueChamps = {"KAISA", "SAMIRA", "KATARINA", "ASHE", "VAYNE", "SARAHFORTUNE", "JARVANIV", "KHAZIX", "LUCIAN"};
    String[] programLanguages = {"JAVA", "PYTHON", "JAVASCRIPT", "CSHARP", "SWIFT", "CPLUSPLUS", "RUBY", "TYPESCRIPT", "COBRA"};

    public String getWord(String category) {
        int randomChoice = (int) (Math.random() * (8 - 1 + 1) + 1);
        String chosenWord = "";

        System.out.println(randomChoice);

        if(category.equals("Anime Heroes")) {
            chosenWord = animeHeroes[randomChoice];
        } else if (category.equals("basketballLegends")) {
            chosenWord = basketballLegends[randomChoice];
        } else if (category.equals(bestLeagueChamps)) {
            chosenWord = bestLeagueChamps[randomChoice];
        } else if (category.equals(programLanguages)) {
            chosenWord = programLanguages[randomChoice];
        } else System.out.println("Error");

        return chosenWord;
    }
}
