package com.RMSCourse.Projects.XOGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome aboard ! [made by Ahmed Ramy]");
        System.out.print("Please Enter Player 1's Name: ");
        Player.player1Name = in.nextLine();
        System.out.print("Please Enter Player 2's Name: ");
        Player.player2Name = in.nextLine();
        Player.greeting();

        GameLayout game = new GameLayout();
        game.makeLayout();
        boolean isPlayer1 = true;
        gameLoop: while (true)
        {
            game.display();
            System.out.println("1-Play\n2-Exit");
            int prompt = in.nextInt();
            switch (prompt)
            {
                case 1:

                    System.out.println("Enter The Position to play in: ");
                    int position = in.nextInt();
                    boolean notOccupied = game.setPosition(position, isPlayer1); // if position is not , setPosition returns true , allowing player to make another move rather than having his turn wasted
                    isPlayer1 = (notOccupied) != isPlayer1; // magic
                    System.out.println(game.hasWon());
                    break;
                case 2:
                    break gameLoop;
            }
        }
    }
}
