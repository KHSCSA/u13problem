/*
* Problem 1: Escape Room
* 
* V1.0
* 10/10/2019
* Copyright(c) 2019 PLTW to present. All rights reserved
*/


/**
 * Create an escape room game where the player must navigate
 * to the other side of the screen, 
 * while avoiding obstacles and collecting prizes.
 */
class Main
{

      // Allow game commands:
      //    right, left, up, down: if you try to go off grid or bump into wall, score decreases
      //    jump over 1 space: you cannot jump over walls
      //    if you land on a trap, spring a trap to increase score: you must first check if there is a trap, if none exists, penalty
      //    pick up prize: score increases, if there is no prize, penalty
      //    help: display all possible commands
      //    end: reach the far right wall, score increase, game ends, if game ended without reaching far right wall, penalty
      //    replay: shows number of player steps and resets the board, you or another player can play the same board
      // Note that you must adjust the score with any method that returns a score


    public static void main(String[] args) 
    {      

        // welcome message
        System.out.println("Welcome to EscapeRoom!");
        System.out.println("Get to the other side of the room, avoiding walls and invisible traps,");
        System.out.println("pick up all the prizes.\n");

        GameGUI game = new GameGUI();
        game.createBoard();

        // size of move
        int m = 60; 
        int score = 0;

        // you may or may not need the following
        // to represent the players distance to move
        int distToMoveX = 0;
        int distToMoveY = 0;
        
        String[] validCommands = { "right", "left", "up", "down", "r", "l", "u", "d",
        "jump", "jr", "jumpleft", "jl", "jumpup", "ju", "jumpdown", "jd",
        "pickup", "p", "quit", "q", "replay", "help", "?"};

        // set up game
        boolean play = true;
        while (play)
        {
            /* TODO: get all the commands working */
            /* Your code here */


        } // close while (gameplay)


        // TODO
        // end the game
        // show the score and the 'steps'

    } // close main

    // helper functions??


} // close Main

