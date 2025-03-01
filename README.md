# Assignment3

There are three parts for assignment 3:
- [ ] Part 1 - Working with memory diagrams
- [ ] Part 2 - UML diagrams and inheritance
- [ ] Part 3 - Continuing your game development using inheritance

## Part 1: Working with memory diagrams
In the first task of the assignment, you will draw two memory diagrams to explain how objects are instantiated 
and assigned through the execution of a program.

For this exercise, download the files `Library.java`, `Book.java`, `Member.java` and `Loan.java`. You should first run the program from the
`main()` in Library. Then, explore these classes to understand how this program is structured. You are encouraged to make any modifications
to these files that allow you to better understand any parts of it, just make sure to return it to its original state to complete this task.

To complete this task, you must draw two memory diagrams for two objects that are instaniated in the `main()` in Library. 
Download Assignment3.pdf, and complete these two diagrams by hand.

## Part 2: UML diagrams and inheritance
For this task, you need to imagine a program that manages a zoo of Animals and think about how you would design this program. In this task, you will sketch an outline of your program by writing UML diagrams for a hierarchy of classes related to animals. Specifically, you should have a UML for an Animal class. Then, you should create two subclasses for different types of animals (Reptile, Mammal, Amphibian, etc.), these subclasses should, themselves, each have two meangingful subclasses. Your UML diagrams must contain the name of each class, their instance variables, instance methods, and the symbols for the visibility modifiers (- for private, + for public, and # for protected). Each class must have at least 2 instance variables and 2 instance methods that are not inherited from a parent.

Note: the protected visibility modifier is useful for the instance variables of parent classes when you would like subclasses to be able to refer to the parent variable.
 
## Part 3: Your Adventure Games
In this task, you will augment your game with a hierarchy of classes representing the items that are available in your game (the items that are in the treasure chests in each room and that a player can add to their inventory). To do this, create a new class called `Treasure` which will be the parent class for this hierarchy. Then, create at least 2 subclasses of Treasure to represent more specific types of items available in your game. It could be helpful to go back to your map from assignment 1 to see what you had planned, it's also ok if you create classes for items that you hadn't considered in assignment 1 but that's a good starting point.

Design these three classes with inheritance in mind: what should be in the top-level `Treasure` class? What should be more specific in the subclasses? You will need to plan how to structure the constructors, instance variables, and instance methods for this.

At this point, you don't need to integrate this hierarchy into your game. We'll get there in the next assignment :)

## COLLABORATION
This assignment is an individual assignment. You can discuss this assignment with your peers, TA and instructor. You cannot show code to your peers, you each write your own solutions. You can show code to the TAs and instructor. Additionally, you cannot use generative AI or online resources that are not linked from our course website to complete this assignment.  

## SUBMISSION
Submit the following files to Gradescope for Assignment 1:
* take a picture of your solutions to Part 1 and Part 2 and upload a .png or .jpeg file to Gradescope
* upload your solutions to `Treasure.java`, and two more classes that you designed to Gradescope

Note: You can resubmit your assignment as many times as needed until the deadline. Every time you resubmit, make sure you submit *all* of the files for your assignment every time.

## ASSIGNMENT SOLUTIONS
Assignment solutions will not be shared. If you did not get full credit on the assignment, you should review the feedback and ask me or the TAs if you have further questions. 
