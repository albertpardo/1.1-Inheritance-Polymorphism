package level3ex1;

import java.awt.*;
import java.util.Scanner;

public class MenuNewsOptionsSubmenus {

    public static void footballNews(String title, Writer writer){
        Footballnews footballnews;
        Scanner scanner = new Scanner(System.in);
        String input;
        int option = 0;
        String competition = "";
        String club = "";
        String player = "";

        System.out.println("FootballNews questions:");
        while (option == 0){
            System.out.println("Select competition:");
            System.out.println("1.- " + ConstatsKeysNews.FOOTBALL_LEAGUE_CHAMPIONS);
            System.out.println("2.- " + ConstatsKeysNews.FOOTBALL_LEAGUE_LALIGA);
            System.out.println("3.- Other league (must be put):");
            input = scanner.nextLine();
            if (input.matches("[1-3]"))
                option = Integer.parseInt(input);
            else
                System.out.println("\nBad option!!");
        }
        switch (option) {
            case 1:
                competition = ConstatsKeysNews.FOOTBALL_LEAGUE_CHAMPIONS;
                break;
            case 2:
                competition = ConstatsKeysNews.FOOTBALL_LEAGUE_LALIGA;
                break;
            case 3:
                competition = MenuUtils.inputStringByCli("Competition name?");
                break;
        }
        System.out.println("Select Club:");
        option = 0;
        while (option == 0){
            System.out.println("1.- " + ConstatsKeysNews.CLUB_FOOT_BCN);
            System.out.println("2.- " + ConstatsKeysNews.CLUB_FOOT_MAD);
            System.out.println("3.- Other club (must be put):");
            input = scanner.nextLine();
            if (input.matches("[1-3]"))
                option = Integer.parseInt(input);
            else
                System.out.println("\nBad option!!");
        }
        switch (option) {
            case 1:
                club = ConstatsKeysNews.CLUB_FOOT_BCN;
                break;
            case 2:
                club = ConstatsKeysNews.CLUB_FOOT_MAD;
                break;
            case 3:
                club = MenuUtils.inputStringByCli("Club name?");
                break;
        }

        System.out.println("Select player:");
        option = 0;
        while (option == 0){
            System.out.println("1.- " + ConstatsKeysNews.PLAYER_BEN);
            System.out.println("2.- " + ConstatsKeysNews.PLAYER_FER);
            System.out.println("3.- Other player (must be put):");
            input = scanner.nextLine();
            if (input.matches("[1-3]"))
                option = Integer.parseInt(input);
            else
                System.out.println("\nBad option!!");
        }
        switch (option) {
            case 1:
                player = ConstatsKeysNews.PLAYER_BEN;
                break;
            case 2:
                player = ConstatsKeysNews.PLAYER_FER;
                break;
            case 3:
                player = MenuUtils.inputStringByCli("Player name?");
                break;
        }
        footballnews = new Footballnews(title, competition, club, player);
        writer.addNews(footballnews);
    }

    public static void basketballNews(String title, Writer writer){
        Basketballnews basketballnews;
        Scanner scanner = new Scanner(System.in);
        String input;
        int option = 0;
        String competition = "";
        String club = "";

        System.out.println("BasketballNews questions:");
        while (option == 0){
            System.out.println("Select competition:");
            System.out.println("1.- " + ConstatsKeysNews.BASKET_LEAGUE_EURO);
            System.out.println("2.- " + ConstatsKeysNews.BASKET_LEAGUE_ACB);
            System.out.println("3.- Other league (must be put):");
            input = scanner.nextLine();
            if (input.matches("[1-3]"))
                option = Integer.parseInt(input);
            else
                System.out.println("\nBad option!!");
        }
        switch (option) {
            case 1:
                competition = ConstatsKeysNews.BASKET_LEAGUE_EURO;
                break;
            case 2:
                competition = ConstatsKeysNews.BASKET_LEAGUE_ACB;
                break;
            case 3:
                competition = MenuUtils.inputStringByCli("Competition name?");
                break;
        }
        System.out.println("Select Club:");
        option = 0;
        while (option == 0){
            System.out.println("1.- " + ConstatsKeysNews.CLUB_BASKET_BCN);
            System.out.println("2.- " + ConstatsKeysNews.CLUB_BASKET_MAD);
            System.out.println("3.- Other club (must be put):");
            input = scanner.nextLine();
            if (input.matches("[1-3]"))
                option = Integer.parseInt(input);
            else
                System.out.println("\nBad option!!");
        }
        switch (option) {
            case 1:
                club = ConstatsKeysNews.CLUB_BASKET_BCN;
                break;
            case 2:
                club = ConstatsKeysNews.CLUB_BASKET_MAD;
                break;
            case 3:
                club = MenuUtils.inputStringByCli("Club name?");
                break;
        }
        basketballnews = new Basketballnews(title, competition, club);
        writer.addNews(basketballnews);
    }

    public static void tennisNews(String title, Writer writer){
        Tennisnews tennisNews;
        Scanner scanner = new Scanner(System.in);
        String input;
        int option = 0;
        String player = "";

        System.out.println("TennisNews questions:");
        System.out.println("Select player:");
        option = 0;
        while (option == 0){
            System.out.println("1.- " + ConstatsKeysNews.PLAYER_FEDE);
            System.out.println("2.- " + ConstatsKeysNews.PLAYER_NADAL);
            System.out.println("3.- " + ConstatsKeysNews.PLAYER_DJO);
            System.out.println("4.- Other player (must be put):");
            input = scanner.nextLine();
            if (input.matches("[1-4]"))
                option = Integer.parseInt(input);
            else
                System.out.println("\nBad option!!");
        }
        switch (option) {
            case 1:
                player = ConstatsKeysNews.PLAYER_FEDE;
                break;
            case 2:
                player = ConstatsKeysNews.PLAYER_NADAL;
                break;
            case 3:
                player = ConstatsKeysNews.PLAYER_DJO;
                break;
            case 4 :
                    player = MenuUtils.inputStringByCli("Player name?");
                break;
        }

        tennisNews = new Tennisnews(title, player);
        writer.addNews(tennisNews);

    }
}
