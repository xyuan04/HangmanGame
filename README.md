# Week2-Hangman
build a hangman game in Java

## Fork, then clone...

- Fork this repo to your account.
- Then clone it to your computer.

## As you start

Right away:
Add your name as a comment to the Hangman.java class, and do a "git trio" -> 

```
git add .
git commit -m "added my name"
git push origin main
```

Check the web page for your repo, make sure your change has appeared there.

## Now Then

This is a simple game creation project. You are encouraged to make your game class and then to add cool things to it.

The game looks something like this when the player loses.

```
Let's Play Hangman version 1.0
Current Guesses: 
_ _ _ _ 
You have 4 tries left.
Enter a single character: 
f
Current Guesses: 
_ _ _ _ 
You have 3 tries left.
Enter a single character: 
c
Current Guesses: 
_ _ _ _ 
You have 2 tries left.
Enter a single character: 
e
Current Guesses: 
_ _ _ e 
You have 1 tries left.
Enter a single character: 
f
:-( :-( :-(
_ _ _ e 
You Lost! You ran out of guesses.
Would you like to play again? (yes/no) 
no
Game Over.
```

And like this if the player wins.

```
Let's Play Hangman version 1.0
Current Guesses: 
_ _ _ 
You have 3 tries left.
Enter a single character: 
c
Current Guesses: 
c _ _ 
You have 2 tries left.
Enter a single character: 
t
Current Guesses: 
c _ t 
You have 1 tries left.
Enter a single character: 
a
**** ****
c a t 
Congratulations, You Won!
Would you like to play again? (yes/no) 
no
Game Over.
```

The idea is, the player...

- starts the game
- a random word is chosen from a list
- the number of tries allowed is set to the length of the word
- setup the two (the solution and the player's guesses) character arrays
- WHILE the numbers of tries is less than tries allowed AND
- the player has not guessed the word
  - print the current state of the player's guesses
  - ask the player for a letter (a character)
  - if the letter is a minus "-", quit the game
  - else process the letter
  - if the letter makes the work complete,
    - the player wins
- after the while loop
  - if the word is not guessed, player loses

Now, another twist to the game is to add an "outer loop" which asks the player if they would like to play again. This outer loop would surround the logic in the outline above.

But for v1, just create the game to play a single word each time it is run.
Once you have that running, add the outer loop.
Call it v2.

Write the main Hangman class, and the needed game methods.
Try to keep your methods small.
If the methods get too big, break them up into smaller pieces with other methods.
Read [Notes.md](./Notes.md) to understand more about how you might design the internals of the Hangman class.

BE SURE to do git commits along the way.
You don't want to lose any code.
