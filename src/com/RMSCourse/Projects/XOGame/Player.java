package com.RMSCourse.Projects.XOGame;

public class Player {
    public static String player1 = "X";
    public static String player2 = "O";
    public static String player1Name = "";
    public static String player2Name = "";

    public static void greeting()
    {
        System.out.println("Hello , " + player1Name);

        System.out.println("Hello , " + player2Name);

        System.out.println(player1Name +" is Assigned to X\n" + player2Name+" is Assigned to O");
        System.out.println("May the odds be in your favors , Valar Mogolus");
    }




}
