## Notes on how to build the Hangman class

#### Zip Code Wilmington.

Throughout this lab, the use of `char` or character means a single letter. String means a string of one or more letters.
Remember in Java `'a'` is a single char, `"a"` is a String with a single char. 
BUT THEY ARE DIFFERENT Types!
And are NOT the same thing.

#### The basic idea of the lab

You'll be creating a class called 'Hangman'.
The game chooses a word from an array (list) of words.

```
words <- { "cat", "dog", "bog", "cut"}
```

Since the `words` array is an array of Strings, the above array has the length of 4 and its indexes go from 0 to 3.
If you chose the first word `words[0]` you'd expect the String "cat".
If you chose `word[1]`, you get "dog".

If you wanted to choose a random word, you need a random number in the range of 0..3 (`0..words.length-1`).
Once you have the random number, you could use it to get the random word.

```
random_Num <- get_Next_Random_Integer(words.length)
secret_Word <- words[random_Num]
```

So as you may have guessed words are Strings in this program. 
But a String doesn't act like an array of `char` all that well.
So, you probably want to transform your chosen word into an array of `char`.
You need to change the String into an array of characters `char[]`.
You'll not be surprised that there is a method in the String class that does just that.

Now, you need another array to hold the player's guesses in.
It needs to be the same size as the word's character array.
You should initialize the guesses array with underscores "_".

Then, as you get each of the player's guessed letters, you step thru the word array, looking to see if the character guessed is in the word and if it is, you replace the "_" with the guessed letter.

```
// indices  0    1    2
wordArray=['c', 'a', 't']
guesses = ['_', 'a', '_']
```

This is what the two arrays would look like if the secret word was "cat" and the player had guessed 'a' as the first guess.

As each guess comes in, it is either filled in the player's guesses or ignored.

In the Hangman class, your "main" function will look like this:

```java
    public static void main(String[] args){
        Hangman game = new Hangman();
        game.runGame();
    }
```

So that means you have to at least write a `runGame()` method.
Within the class setup a Constructor `public Hangman() {}` and after that, place the `main` code.
Setup a place for instance variables, and the list of words.

```java
// instance variables go here

// set up a list (array) of strings of words players could guess
```

a `public void runGame()` method's logic will roughly follow this pseudo-code. There is a nest loop here, the outer one for each game the player plays, the inner one handling each game.

```
choose a random word from a list

while (you want to play) { //outer loop
    start the game
    set word guessed to false
    while (the word isn't guessed) { //inner loop
        print the current game state
        ask for a guess (a single letter)

        check the letter against the word
          using the two character arrays discussed above
        increment the number of guesses

        if the word is guessed
            player won, congrats
        
        if too many guesses
            player lost, too bad, quit game
    }
    ask if player wants to play again
}
display game over
```

The `printArray(char[] a)` method just print out the characters array `a` with a space between each letter.
You'll need a `for` loop to print each character and a space right after.

In addition to `runGame()` and `printArray`, I'd also suggest you think about creating each of these methods in the Hangman class.

- announce_game() prints a welcome
- game_over() prints "game over"
- initialize_game_state() sets up char[] for secret word and guesses
- get_next_guess() returns a char from player input
- is_word_guessed() returns boolean
- ask_to_play_again() returns boolean
- print_current_state() uses printArray to show player where they are at
- process() loops thru the word array, looking for the inputed guess, and replaces the "_" with the guesses char if found
- player_won() prints happy message
- player_lost() print sad message 

Some hints

- all output or input must be in specialized methods, not in `runGame()`
- you should use instance variables to sync all the game state
- use "this." to call all your methods in class Hangman
- You need to use the Scanner class to get the player's guess
- You need to use the Random class to get a random int to choose the secret word
- when a method name like "player_won()" is used you need to translate it in to "camelCase" so it would appear as "playerWon()" in your code.

_kyounger_
