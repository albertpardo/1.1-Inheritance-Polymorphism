package level3ex1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuNewsOptionsSubmenus {
    private static final String CHAMPIONS = "Champions league";
    private static final String CLUB_BCN = "Barcelona";
    private static final String CLUB_MAD = "Madrid";
    private static final String PLAYER_FER = "Ferran Torres";
    private static final String PLAYER_BEN = "Benzema";


    public static void footballNews(String title, ArrayList<Writer> writers){
        Footballnews footballnews;
        Scanner scanner = new Scanner(System.in);
        String input;
        int option = 0;
        String competition;
        String club = "";
        String player = "";

        System.out.println("FootballNews questions:");
        while (option == 0){
            System.out.println("Select competition:");
            System.out.println("1.- " + CHAMPIONS);
            System.out.println("2.- Other league (must be put):");
            input = scanner.nextLine();
            if (input.matches("[1-2]"))
                option = Integer.parseInt(input);
            else
                System.out.println("\nBad option!!");
        }
        if (option == 1)
            competition = CHAMPIONS;
        else {
            competition = MenuUtils.inputStringByCli("Competition name?");
        }

        System.out.println("Select Clubr:");
        option = 0;
        while (option == 0){
            System.out.println("1.- " + CLUB_BCN);
            System.out.println("2.- " + CLUB_MAD);
            System.out.println("3.- Other club (must be put):");
            input = scanner.nextLine();
            if (input.matches("[1-3]"))
                option = Integer.parseInt(input);
            else
                System.out.println("\nBad option!!");
        }
        switch (option) {
            case 1:
                club = CLUB_BCN;
                break;
            case 2:
                club = CLUB_MAD;
                break;
            case 3:
                club = MenuUtils.inputStringByCli("Club name?");
                break;
        }

        System.out.println("Select player:");
        option = 0;
        while (option == 0){
            System.out.println("1.- " + PLAYER_BEN);
            System.out.println("2.- " + PLAYER_FER);
            System.out.println("3.- Other player (must be put):");
            input = scanner.nextLine();
            if (input.matches("[1-3]"))
                option = Integer.parseInt(input);
            else
                System.out.println("\nBad option!!");
        }
        switch (option) {
            case 1:
                player = PLAYER_BEN;
                break;
            case 2:
                player = PLAYER_FER;
                break;
            case 3:
                player = MenuUtils.inputStringByCli("Player name?");
                break;
        }

        System.out.println(competition + ", " + club + ", " + player);
        footballnews = new Footballnews(title, competition, club, player);
        System.out.println("NOTICIA : \n" + footballnews.toString());
    }
}
