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
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "B":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "C":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "D":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "E":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "F":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "G":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "H":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "I":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "J":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "K":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "L":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "M":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "N":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "O":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "P":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "Q":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "R":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "S":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "T":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "U":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "V":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "W":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "X":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
                case "Y":
                    convertedInput = userInput.charAt(0);
                    match = false;
                    break;
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
