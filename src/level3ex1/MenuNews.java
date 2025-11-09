package level3ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuNews {

    private static void printMenuNews(){
        System.out.println("News' Menu.");
        System.out.println("1.- Football.");
        System.out.println("2.- Basketball.");
        System.out.println("3.- Tennis.");
        System.out.println("4.- F1");
        System.out.println("5.- Motorcycling");
    }

    private static int getOption(){
        Scanner scanner = new Scanner(System.in);
        String readLine;
        int option;

        System.out.print("\nChoose News' Type: ");
        readLine = scanner.nextLine();
        //if (readLine.length() == 1 & (readLine.charAt(0) >'0' & readLine.charAt(0) <'9'))
        if (readLine.matches("[1-5]"))
            option = Integer.parseInt(readLine);
        else {
            System.out.println("\nBad option!!");
            option = 0;
        }
        return option;
    }

    private static void executeOption(int option, Writer writer) {
        String title;

        title = MenuUtils.inputStringByCli("News title? ");
        switch (option) {
            case 1:
                MenuNewsOptionsSubmenus.footballNews(title,writer);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }

    public static void start(Writer writer){
        int option;
        boolean exit = false;

        printMenuNews();
        option = getOption();
        if (option > 0)
            executeOption(option, writer);
        System.out.println();
    }
}
