package level3ex1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MenuMainOptionsMethods {
    private void printWritersInfo(ArrayList<Writer> writers){
        System.out.println("\n Writers Info: ");
        Iterator<Writer> it = writers.iterator();
        while (it.hasNext())
            System.out.println("- " + it.next().toString());
    }

    private void printWritersName(ArrayList<Writer> writers){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Writers Names List: ");
        for (int i = 0; i < writers.size(); i++){
            System.out.println(" - Id:" + i + "\tNAME: " + writers.get(i).getName());
        }
    }

/*
    private String inputStringByCli(String msg) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (input.isEmpty()){
            System.out.println(msg);
            input = scanner.nextLine();
        }
        return input;
    }
*/

    public void addWriter(ArrayList<Writer> writers) {
        /*
        String name = "";
        String dni = "";
        Scanner scanner = new Scanner(System.in);

        while (name.isEmpty()){
            System.out.println("Writer's name?");
            name = scanner.nextLine();
        }
        while (dni.isEmpty()){
            System.out.println("Writer's DNI?");
            dni = scanner.nextLine();
        }
        */
        String name;
        String dni;

        name = MenuUtils.inputStringByCli("Writer's name?");
        dni = MenuUtils.inputStringByCli("Writer's DNI?");
        writers.add(new Writer(name, dni));
        printWritersInfo(writers);
    }

    public void deleteWriter(ArrayList<Writer> writers) {
        /*
        String input1, input2;
        Scanner scanner = new Scanner(System.in);
        int writerId;

        printWritersName(writers);
        System.out.print("\nTo delete, put the Id associated to Writer's name: ");
        input1 = scanner.next();
        input2 = scanner.nextLine();
        if (input2.isEmpty() && input1.matches("^\\d+$")){
            writerId = Integer.parseInt(input1);
            if (writerId < writers.size()){
                String name;

                name = writers.get(writerId).getName();
                writers.remove(writerId);
                System.out.println("\n " + name + " has been deleted!");
            }
            else
                System.out.println("\nNo valid Id!!!");
        }
        else
            System.out.println("\nInput Error!!!");

         */
        int writerId;

        writerId = MenuUtils.inputWriterIdByCli(writers);
        if (writerId > -1){
            String name;

            name = writers.get(writerId).getName();
            writers.remove(writerId);
            System.out.println("\n " + name + " has been deleted!");
        }

    }

    public void assignNewsToWriter(ArrayList<Writer> writers) {
        /*
        Writer writer;
        String input1, input2;
        Scanner scanner = new Scanner(System.in);
        int writerId;

        printWritersName(writers);
        System.out.print("\nPut the writer Id to select one: ");
        input1 = scanner.next();
        input2 = scanner.nextLine();
        if (input2.isEmpty() && input1.matches("^\\d+$")){
            writerId = Integer.parseInt(input1);
            if (writerId < writers.size()){
                writer = writers.get(writerId);
                System.out.println("-> Selected writer name :" + writer.getName());
                MenuNews.start(writer);
            }
            else
                System.out.println("\nNo valid Id!!!");
        }
        else
            System.out.println("\nInput Error!!!");

         */
        int writerId;

        writerId = MenuUtils.inputWriterIdByCli(writers);
        if (writerId > -1)
            MenuNews.start(writers.get(writerId));

    }

    public void deleteNews(ArrayList<Writer> writers) {

        Writer writer;
        String input1, input2;
        Scanner scanner = new Scanner(System.in);
        int writerId;

        printWritersName(writers);
        System.out.print("\nPut the writer Id to select one: ");
        input1 = scanner.next();
        input2 = scanner.nextLine();
        if (input2.isEmpty() && input1.matches("^\\d+$")){
            writerId = Integer.parseInt(input1);
            if (writerId < writers.size()){
                writer = writers.get(writerId);
                System.out.println("-> Selected writer name :" + writer.getName());
                System.out.println("\nList of News:");
                writer.printAssignedNews();

                System.out.println("Put de news ID to delete : ");
                input1 = scanner.next();
                input2 = scanner.nextLine();
                if (input2.isEmpty() && input1.matches("^\\d+$")){
                    int option;
                    option = Integer.parseInt(input1);
                    if (option > -1 && option < writer.getAssignedNewsSize()){
                        writer.deleteNewsById(option);
                        System.out.println(" The news with ID = " + option + " has been deleted");
                    }
                    else {
                        System.out.println("\nNo valid Id!!!");
                    }
                }
                else
                    System.out.println("\nNo valid Id!!!");
            }
            else
                System.out.println("\nNo valid Id!!!");
        }
        else
            System.out.println("\nInput Error!!!");
    }

    public void showNewsByWriter(ArrayList<Writer> writers) {
        Writer writer;
        String input1, input2;
        Scanner scanner = new Scanner(System.in);
        int writerId;

        printWritersName(writers);
        System.out.print("\nPut the writer Id to select one: ");
        input1 = scanner.next();
        input2 = scanner.nextLine();
        if (input2.isEmpty() && input1.matches("^\\d+$")){
            writerId = Integer.parseInt(input1);
            if (writerId < writers.size()){
                writer = writers.get(writerId);
                System.out.println("-> Selected writer name :" + writer.getName());
                System.out.println("\nList of News:");
                writer.printAssignedNews();
            }
            else
                System.out.println("\nNo valid Id!!!");
        }
        else
            System.out.println("\nInput Error!!!");
    }

    public void calculateScoreNews(ArrayList<Writer> writers, MapOfPointsPricesForNews pointsPricesNewsMap) {

        Writer writer;
        String input1, input2;
        Scanner scanner = new Scanner(System.in);
        int writerId;

        printWritersName(writers);
        System.out.print("\nPut the writer Id to select one: ");
        input1 = scanner.next();
        input2 = scanner.nextLine();
        if (input2.isEmpty() && input1.matches("^\\d+$")){
            writerId = Integer.parseInt(input1);
            if (writerId < writers.size()){
                writer = writers.get(writerId);
                System.out.println("-> Selected writer name :" + writer.getName());
                System.out.println("\nList of News:");
                writer.printAssignedNews();

                System.out.println("Put de news ID to calculate the price : ");
                input1 = scanner.next();
                input2 = scanner.nextLine();
                if (input2.isEmpty() && input1.matches("^\\d+$")){
                    int option;
                    option = Integer.parseInt(input1);
                    if (option > -1 && option < writer.getAssignedNewsSize())
                        writer.getAssignedNewsById(option).calculateScore(pointsPricesNewsMap);
                    else
                        System.out.println("\nNo valid Id!!!");
                }
                else {
                    System.out.println("\nNo valid Id!!!");
                }
            }
            else
                System.out.println("\nNo valid Id!!!");
        }
        else
            System.out.println("\nInput Error!!!");
    }

    public void calculateNewsPrice(ArrayList<Writer> writers, MapOfPointsPricesForNews pointsPricesNewsMap) {
        Writer writer;
        String input1, input2;
        Scanner scanner = new Scanner(System.in);
        int writerId;

        printWritersName(writers);
        System.out.print("\nPut the writer Id to select one: ");
        input1 = scanner.next();
        input2 = scanner.nextLine();
        if (input2.isEmpty() && input1.matches("^\\d+$")){
            writerId = Integer.parseInt(input1);
            if (writerId < writers.size()){
                writer = writers.get(writerId);
                System.out.println("-> Selected writer name :" + writer.getName());
                System.out.println("\nList of News:");
                writer.printAssignedNews();

                System.out.println("Put de news ID to calculate the price : ");
                input1 = scanner.next();
                input2 = scanner.nextLine();
                if (input2.isEmpty() && input1.matches("^\\d+$")){
                    int option;
                    option = Integer.parseInt(input1);
                    if (option > -1 && option < writer.getAssignedNewsSize())
                        writer.getAssignedNewsById(option).calculatePrice(pointsPricesNewsMap);
                    else
                        System.out.println("\nNo valid Id!!!");
                }
                else {
                    System.out.println("\nNo valid Id!!!");
                }
            }
            else
                System.out.println("\nNo valid Id!!!");
        }
        else
            System.out.println("\nInput Error!!!");
    }

}
