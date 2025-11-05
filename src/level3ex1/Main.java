package level3ex1;

import java.util.Scanner;

public class Main {
    static void printMenu(){
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
    static void menu(){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int option = 0;
        String readLine = "";

        while (!exit){
            printMenu();
            System.out.print("\nChoose option: ");
            readLine = scanner.nextLine();
            if (readLine.length() != 1){
                System.out.println("\nBad option!!");
                option = 0;
            }
            else {
                if (readLine.charAt(0) >'0' & readLine.charAt(0) <'9'){
                    option = Integer.parseInt(readLine);
                    if (option == 8)
                        exit = true;
                }
                else {
                    System.out.println("\nBad option!!");
                    option = 0;
                }
            }


            System.out.println();
        }
    }
    public static void main(String[] args){
        menu();
    }
}
