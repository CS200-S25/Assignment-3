# Assignment3

There are three parts for assignment 3:
- [ ] Part 1 - Working with memory diagrams
- [ ] Part 2 - UML diagrams and inheritance
- [ ] Part 3 - Continuing your game development to put your learning into practice in a creative way

## Part 1: Working with memory diagrams
In the first task of the assignment, you will draw two memory diagrams to explain how objects are instantiated 
and assigned through the execution of a program.

For this exercise, download the files Library.java, Book.java, Member.java and Loan.java. You should first run the program from the
`main()` in Library. Then, explore these classes to understand how this program is structured. You are encouraged to make any modifications
to these files that allow you to better understand any parts of it, just make sure to return it to its original state to complete this task.

To complete this task, you must draw two memory diagrams for two objects that are instaniated in the `main()` in Library. 
Download Assignment3.pdf, and complete these two diagrams by hand.

## Part 2: UML diagrams and inheritance
Complete the questions about the two recursive methods in `Assignment2.pdf`.

Goals of this part:
 * Practice tracing and understanding recursive methods.
 
## Part 3: Your Adventure Games
Return to the map for your adventure game that you submitted for Assignment 1. In this assignment, you will add a class to represent the animals present in the rooms of your game and you will add treasure chests.

Start by making any fixes to your Game.java, Player.java and Room.java files based on the feedback from Assignment 1.

### Task 1: Create an Animal class
In this task, create a new class from scratch to represent an `Animal`. An animal must have a name and must have an amount of damage it can do to a player. Beyond these requirements, you can design this class in the way that is best suited for your game.

### Task 2: Use Animal in your Room class
Now that you have a new class for `Animal`, you must add an Animal to `Room`. You must improve the design of the `Room` class to allow a `Room` to have an `Animal`. You must add a new instance variable to `Room` and you can add any necessary method to `Room` for this purpose as well. You must also update the `Room` constructor to add an `Animal` to a `Room` when a new `Room` is instantiated.

### Task 3: Add an inventory to your Player class
You need to modify the `Player` class to manage a collection of treasures as an `ArrayList`. In this game, a treasure will be represented as a String for example "Key", "Ring", "Gem". You must add a new instance variable to `Player` for this `inventory` and a method called `addTreasure()` that adds one treasure to the inventory. You can add any necessary method to `Player` for this purpose as well. You must also update the `Player` constructor to initialize the `inventory`.

### Task 3: Add a treasure chest to your Room class
You need to modify the `Room` class to manage a collection of treasures as an `ArrayList`. You must add a new instance variable to `Room` for this `treasureChest`, a method called `addTreasure()` that adds one treasure to the treasure chest, a method called `removeTreasure(String t)` that removes the treasure from the `treasureChest`, and a method called `findTreasure(String t)` that returns a boolean based on whether the `treasureChest` contains that item or not. You can add any other necessary method to `Room` for this purpose as well. You must also update the `Room` constructor to initialize the `treasureChest`.

### Task 4: Update your Game class
You also need to modify the `Game` class. In Game, you will need to modify the input to your `Room` constructor calls. In addition, after initalizing the rooms for your game, you will need to `addTreasure()` to each `Room`. Add the treasures to each room according to your game map from Assignment 1.

You will need to make two additional modifications to `Game`:

1) Add this new method to your `Game` class:
```
public void take(String t) {
        Room room = p1.getLocation();
        if(room.findTreasure(t)){
            room.removeTreasure(t);
            p1.addTreasure(t);
            System.out.println("You added "+t+" to your inventory.");
        }else{
            System.out.println("You were not able to take "+t);
        }
}
```
   
3) In the method `parseCommand(String input)` you should add a call to `take()` as follows:
```
public void parseCommand(String input) {
        
        String[] wordList = input.split("[\s]");
        String verb;
        String noun;
        
        if(wordList.length < 2 || wordList.length > 2) {
            System.out.println("Only 2 word commands allowed!");
        } else {
            verb = wordList[0];
            noun = wordList[1];
            switch (verb) {
                case "take":
                    take(noun); // THIS IS THE NEW ADDITION
                case "drop":
                    //exit = room.getS();
                case "eat":
                    //exit = room.getE();
                case "go":
                    movePlayer(noun);
                    break;
                default:
                    System.out.println(verb + " is not a known verb!");
            }
        }
    }
```

You should also update any necessary `toString()` and any other text that is displayed to the user so that the game is playable. A user should be able to navigate rooms, see what treasures are available in the room, and take treasures from the room. When a user takes a treasure, it is added to their inventory and removed from the room treasure chest.

Make sure to test your code frequently! Run if after writing a few lines to check incrementally.

## COLLABORATION
This assignment is an individual assignment. You can discuss this assignment with your peers, TA and instructor. You cannot show code to your peers, you each write your own solutions. You can show code to the TAs and instructor. Additionally, you cannot use generative AI or online resources that are not linked from our course website to complete this assignment.  

## SUBMISSION
Submit the following files to Gradescope for Assignment 1:
* take a picture of your solutions to Part 2 and upload a .png or .jpeg file to Gradescope
* upload your solutions to `Professor.java`, `Student.java`, `CS111.java`, `Game.java`, `Room.java`, `Player.java`, and `Animal.java` to Gradescope

Note: You can resubmit your assignment as many times as needed until the deadline. Every time you resubmit, make sure you submit *all* of the files for your assignment every time.

## GRADING RUBRIC
Your assignment will be graded on accuracy, code style (including good name conventions for methods and variables you create, indentation, clean code) and meaningful documentation. Make sure that all of your files have header-level javadoc descriptions and that all of your methods also have javadoc. Include in-line comments sparsely, only to explain code (or a programming decision) that is not self-apparent.

## ASSIGNMENT SOLUTIONS
Assignment solutions will not be shared. If you did not get full credit on the assignment, you should review the feedback and ask me or the TAs if you have further questions. 
