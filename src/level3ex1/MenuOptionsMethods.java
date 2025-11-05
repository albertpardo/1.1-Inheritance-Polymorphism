package level3ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MenuOptionsMethods {
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
    public void addWriter(ArrayList<Writer> writers) {
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
        writers.add(new Writer(name, dni));
        printWritersInfo(writers);
    }

    public void deleteWriter(ArrayList<Writer> writers) {
        String input1, input2;
        Scanner scanner = new Scanner(System.in);
        int writerId;
        String name;

        printWritersName(writers);
        System.out.print("\nTo delete, put the Id associated to Writer's name: ");
        input1 = scanner.next();
        input2 = scanner.nextLine();
        if (input2.isEmpty() && input1.matches("^\\d+$")){
            writerId = Integer.parseInt(input1);
            if (writerId < writers.size()){
                name = writers.get(writerId).getName();
                writers.remove(writerId);
                System.out.println("\n " + name + " has been deleted!");
            }
            else
                System.out.println("\nNo valid Id!!!");
        }
        else
            System.out.println("\nInput Error!!!");
    }

    public void assignNewsToWriter(ArrayList<Writer> writers) {
        System.out.println("TODO assignNewsToWriter!!!");
    }

    public void deleteNews( ArrayList<Writer> writers) {
        System.out.println("TODO deleteNews!!!");
    }

    public void showNewsByWriter(ArrayList<Writer> writers) {
        System.out.println("TODO showNewsByWriter!!!");
    }

    public void calculateScoreNews(ArrayList<Writer> writers) {
        System.out.println("TODO calculateScoreNews!!!");
    }

    public void calculateNewsPrice(ArrayList<Writer> writers) {
        System.out.println("TODO calculateScoreNews!!!");
    }

}
