package rocks.zipcode;

public class Guesses {
    int guessesRemaining;

    public void useGuess() {
        this.guessesRemaining -= 1;
    }

    public char getInput() {
        String userInput = Console.getStringInput("Please guess a letter:");
        char convertedInput = ' ';

        boolean match = true;
        userInput = userInput.toUpperCase();
        while (match) {
            switch (userInput) {
                case "A":
                case "B":
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "H":
                case "I":
                case "J":
                case "K":
                case "L":
                case "M":
                case "N":
                case "O":
                case "P":
                case "Q":
                case "R":
                case "S":
                case "T":
                case "U":
                case "V":
                case "W":
                case "X":
                case "Y":
                case "Z":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                default:
                    userInput = Console.getStringInput("Invalid. Please enter letter:");
                    userInput = userInput.toUpperCase();
                    break;
            }
        }
        return convertedInput;
    }
}
