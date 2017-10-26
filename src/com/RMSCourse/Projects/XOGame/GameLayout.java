package com.RMSCourse.Projects.XOGame;

public class GameLayout {
    public static String[][] gameBody = new String[9][11];
    public int movesCount = 0;
    public void makeLayout()
    {
        for(int i = 0 , k = 1; i < 9; i++)
        {
            for(int j = 0; j < 11; j++)
            {
                if(j == 1 && (i == 1 || i == 4 || i == 7) || j == 5 && (i == 1 || i == 4 || i == 7) || j == 9 && (i == 1 || i == 4 || i == 7))
                {
                    gameBody[i][j] = k + "";
                    k++;
                }
                else if(j == 3 || j == 7)

                    gameBody[i][j] = "|";

                else if(i == 2 || i == 5 || i == 8)

                    gameBody[i][j] = "_";

                else
                    gameBody[i][j] = " ";
            }
        }
    }

    public void display()
    {
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 11; j++)
            {
                System.out.print(gameBody[i][j]);
            }
            System.out.println();
        }
    }

    public boolean setPosition(int position,boolean isPlayer1)
    {
        inputLoop: while (true)
        {
            switch (position)
            {
                case 1:

                    if (gameBody[1][1].equals("1"))
                    {

                        gameBody[1][1] = (isPlayer1) ? Player.player1: Player.player2;
                        movesCount++;
                    }
                    else
                    {
                        System.out.println("[Position is already Marked]");
                        return false;
                    }
                        break inputLoop;
                case 2:
                    if (gameBody[1][5].equals("2"))
                    {
                        gameBody[1][5] = (isPlayer1) ? Player.player1 : Player.player2;
                        movesCount ++;
                    }
                    else
                    {
                        System.out.println("[Position is already Marked]");
                        return false;
                    }
                    break inputLoop;
                case 3:
                    if (gameBody[1][9].equals("3"))
                    {
                        gameBody[1][9] = (isPlayer1) ? Player.player1 : Player.player2;
                        movesCount ++;
                    }
                    else
                    {
                        System.out.println("[Position is already Marked]");
                        return  false;
                    }
                    break inputLoop;

                case 4:
                    if (gameBody[4][1].equals("4"))
                    {
                        gameBody[4][1] = (isPlayer1) ? Player.player1 : Player.player2;
                        movesCount ++;
                    }
                    else
                    {
                        System.out.println("[Position is already Marked]");
                        return false;
                    }
                    break inputLoop;
                case 5:
                    if (gameBody[4][5].equals("5"))
                    {
                        gameBody[4][5] = (isPlayer1) ? Player.player1 : Player.player2;
                        movesCount ++;
                    }
                    else
                    {
                        System.out.println("[Position is already Marked]");
                        return false;
                    }
                    break inputLoop;
                case 6:
                    if (gameBody[4][9].equals("6"))
                    {
                        gameBody[4][9] = (isPlayer1) ? Player.player1 : Player.player2;
                        movesCount ++;
                    }
                    else
                    {
                        System.out.println("[Position is already Marked]");
                        return false;
                    }
                    break inputLoop;
                case 7:
                    if (gameBody[7][1].equals("7"))
                    {
                        gameBody[7][1] = (isPlayer1) ? Player.player1 : Player.player2;
                        movesCount ++;
                    }
                    else
                    {
                        System.out.println("[Position is already Marked]");
                        return  false;
                    }
                    break inputLoop;
                case 8:
                    if (gameBody[7][5].equals("8"))
                    {
                        gameBody[7][5] = (isPlayer1) ? Player.player1 : Player.player2;
                        movesCount ++;
                    }
                    else
                    {
                        System.out.println("[Position is already Marked]");
                        return false;
                    }
                    break inputLoop;
                case 9:
                    if (gameBody[7][9].equals("9"))
                    {
                        gameBody[7][9] = (isPlayer1) ? Player.player1 : Player.player2;
                        movesCount ++;
                    }
                    else
                    {
                        System.out.println("[Position is already Marked]");
                        return false;
                    }
                    break inputLoop;

                default:
                    System.out.println("[Invalid Position]");
                    break inputLoop;
            }
        }
        return true;
    }

    public String hasWon()
    {
        //column check
        if(gameBody[1][1].equals(Player.player1) && gameBody[1][1].equals(gameBody[1][5]) && gameBody[1][5].equals(gameBody[1][9]))
            return Player.player1Name + " Has Won !";
        else if(gameBody[1][1].equals(Player.player2) && gameBody[1][1].equals(gameBody[1][5]) && gameBody[1][5].equals(gameBody[1][9]))
            return Player.player2Name + "Has Won !";

        if(gameBody[4][1].equals(Player.player1) && gameBody[4][1].equals(gameBody[4][5]) && gameBody[4][5].equals(gameBody[4][9]))
            return Player.player1Name + " Has Won !";
        else if(gameBody[4][1].equals(Player.player2) && gameBody[4][1].equals(gameBody[4][5]) && gameBody[4][5].equals(gameBody[4][9]))
            return Player.player2Name + "Has Won !";

        if(gameBody[7][1].equals(Player.player1) && gameBody[7][1].equals(gameBody[7][5]) && gameBody[7][5].equals(gameBody[7][9]))
            return Player.player1Name + " Has Won !";
        else if(gameBody[7][1].equals(Player.player2) && gameBody[7][1].equals(gameBody[7][5]) && gameBody[7][5].equals(gameBody[7][9]))
            return Player.player2Name + "Has Won !";

        //row check
        if(gameBody[1][1].equals(Player.player1) && gameBody[1][1].equals(gameBody[4][1]) && gameBody[4][1].equals(gameBody[7][1]))
            return Player.player1Name + " Has Won !";
        else if(gameBody[1][1].equals(Player.player2) && gameBody[1][1].equals(gameBody[4][1]) && gameBody[4][1].equals(gameBody[7][1]))
            return Player.player2Name + "Has Won !";

        if(gameBody[1][5].equals(Player.player1) && gameBody[1][5].equals(gameBody[4][5]) && gameBody[4][5].equals(gameBody[7][5]))
            return Player.player1Name + " Has Won !";
        else if(gameBody[1][5].equals(Player.player2) && gameBody[1][5].equals(gameBody[4][5]) && gameBody[4][5].equals(gameBody[7][5]))
            return Player.player2Name + "Has Won !";

        if(gameBody[1][9].equals(Player.player1) && gameBody[1][9].equals(gameBody[4][9]) && gameBody[4][9].equals(gameBody[7][9]))
            return Player.player1Name + " Has Won !";
        else if(gameBody[1][9].equals(Player.player2) && gameBody[1][9].equals(gameBody[4][9]) && gameBody[4][9].equals(gameBody[7][9]))
            return Player.player2Name + "Has Won !";

        //diagonal Check
        if(gameBody[1][1].equals(Player.player1) && gameBody[1][1].equals(gameBody[4][5]) && gameBody[4][5].equals(gameBody[7][9]))
            return Player.player1Name + " Has Won !";
        else if(gameBody[1][1].equals(Player.player1) && gameBody[1][1].equals(gameBody[4][5]) && gameBody[4][5].equals(gameBody[7][9]))
            return Player.player2Name + " Has Won !";
        //anti-diagonal Check
        if(gameBody[1][9].equals(Player.player1) && gameBody[1][9].equals(gameBody[4][5]) && gameBody[7][1].equals(gameBody[4][5]))
            return Player.player1Name + " Has Won !";
        else if(gameBody[1][9].equals(Player.player1) && gameBody[1][9].equals(gameBody[4][5]) && gameBody[7][1].equals(gameBody[4][5]))
            return Player.player1Name + " Has Won !";

        //draw Check
        if(movesCount == 9)
            return "Draw !";

        return "[Number of Moves]: " + movesCount/ 2;
    }

}
