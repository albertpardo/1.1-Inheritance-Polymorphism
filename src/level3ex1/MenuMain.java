package level3ex1;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class MenuMain {

    private static void printMenu(){
        System.out.println("Main Menu :");
        System.out.println("1.- Add Writer");
        System.out.println("2.- Delete Writer");
        System.out.println("3.- Assign a News to a Writer");
        System.out.println("4.- Delete a News");
        System.out.println("5.- Show news by Writer");
        System.out.println("6.- Calculate the news' score");
        System.out.println("7.- Calculate the news' price");
        System.out.println("8.- EXIT");
    }

    private static int getOption(){
        Scanner scanner = new Scanner(System.in);
        String readLine;
        int option;

        System.out.print("\nChoose option: ");
        readLine = scanner.nextLine();
        //if (readLine.length() == 1 & (readLine.charAt(0) >'0' & readLine.charAt(0) <'9'))
        if (readLine.matches("[1-8]"))
            option = Integer.parseInt(readLine);
        else {
            System.out.println("\nBad option!!");
            option = 0;
        }
        return option;
    }

     private static void executeOption(int option, ArrayList<Writer> writers, MapOfPointsPricesForNews pointsPricesNewsMap) {
        MenuMainOptionsMethods menuMainOptionsMethods = new MenuMainOptionsMethods();

        switch (option) {
            case 1:
                menuMainOptionsMethods.addWriter(writers);
                break;
            case 2:
                menuMainOptionsMethods.deleteWriter(writers);
                break;
            case 3:
                menuMainOptionsMethods.assignNewsToWriter(writers);
                break;
            case 4:
                menuMainOptionsMethods.deleteNews(writers);
                break;
            case 5:
                menuMainOptionsMethods.showNewsByWriter(writers);
                break;
            case 6:
                menuMainOptionsMethods.calculateScoreNews(writers, pointsPricesNewsMap);
                break;
            case 7:
                menuMainOptionsMethods.calculateNewsPrice(writers, pointsPricesNewsMap);
                break;
        }
    }

    public void start(){
        int option = 0;
        boolean exit = false;
        ArrayList<Writer> writers = new ArrayList<>();
        MapOfPointsPricesForNews pointsPricesNewsMap = new MapOfPointsPricesForNews();

        while (!exit){
            printMenu();
            option = getOption();
            if (option != 8)
                executeOption(option, writers, pointsPricesNewsMap);
            else
                exit = true;
            System.out.println();
        }
    }
}
