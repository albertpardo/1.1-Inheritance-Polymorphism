package level3ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuUtils {

    private static void printWritersName(ArrayList<Writer> writers){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Writers Names List: ");
        for (int i = 0; i < writers.size(); i++){
            System.out.println(" - Id:" + i + "\tNAME: " + writers.get(i).getName());
        }
    }

    public static String inputStringByCli(String msg) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (input.isEmpty()){
            System.out.println(msg);
            input = scanner.nextLine();
        }
        return input;
    }

    public static int inputWriterIdByCli(ArrayList<Writer> writers){
        Writer writer;
        String input1, input2;
        Scanner scanner = new Scanner(System.in);
        int writerId = -1;

        printWritersName(writers);
        System.out.print("\nPut the writer Id to select one: ");
        input1 = scanner.next();
        input2 = scanner.nextLine();
        if (input2.isEmpty() && input1.matches("^\\d+$")){
            writerId = Integer.parseInt(input1);
            if (writerId < writers.size()){
                writer = writers.get(writerId);
                System.out.println("-> Selected writer name :" + writer.getName());
            }
            else
                System.out.println("\nNo valid Id!!!");
        }
        else
            System.out.println("\nInput Error!!!");
        return writerId;
    }
}
