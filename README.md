# Let's play HiLo!
The objective of the game is to guess the correct number, which is a random integer from 0 to 100.
Once you made the correct guess, you progress onto the next level.
If you don't guess the number in a limited amout of tries, you lose the game.
### How it was written
The game stores the user's profiles (name and data) into a HashMap, and then writes the HashMap into `userProfiles.txt` as a single String. It then uses a BufferedReader to read as well as parse the text file and reads it into a HashMap. This allows the user to store their progress. Keep in mind that you do need to delete `userProfiles.txt` if you want to start the game from scratch.
### How to run the game
Clone this GitHub repo onto your computer, open a modern IDE that supports Java 9, and then run the main method in the `LoginScreen.java` class to play the game!  

![Thanksgiving](/Pictures/ThanksgivingTiny.jpg)  
Made during Thanksgiving break, 2019.  
West Lafayette, Indiana
