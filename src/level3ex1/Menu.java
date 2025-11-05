package level3ex1;

import java.util.Scanner;

public class Menu {

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

     private static void executeOption(int option) {
        MenuOptionsMethods menuOptionsMethods = new MenuOptionsMethods();

        switch (option) {
            case 1:
                menuOptionsMethods.addWriter();
                break;
            case 2:
                menuOptionsMethods.deleteWriter();
                break;
            case 3:
                menuOptionsMethods.assignNewsToWriter();
                break;
            case 4:
                menuOptionsMethods.deleteNews();
                break;
            case 5:
                menuOptionsMethods.showNewsByWriter();
                break;
            case 6:
                menuOptionsMethods.calculateScoreNews();
                break;
            case 7:
                menuOptionsMethods.calculateNewsPrice();
                break;
        }
    }

    public void start(){
        int option = 0;
        boolean exit = false;

        while (!exit){
            printMenu();
            option = getOption();
            if (option != 8)
                executeOption(option);
            else
                exit = true;
            System.out.println();
        }
    }
}
