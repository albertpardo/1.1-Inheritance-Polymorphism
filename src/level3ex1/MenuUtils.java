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

    public static int selectWriterIdByCli(ArrayList<Writer> writers){
        Writer writer;
        String input1, input2;
        Scanner scanner = new Scanner(System.in);
        int writerId = -1;

        if (!writers.isEmpty()) {
            printWritersName(writers);
            System.out.print("\nPut the writer Id to select one: ");
            input1 = scanner.next();
            input2 = scanner.nextLine();
            if (input2.isEmpty() && input1.matches("^\\d+$")) {
                writerId = Integer.parseInt(input1);
                if (writerId < writers.size()) {
                    writer = writers.get(writerId);
                    System.out.println("-> Selected writer name :" + writer.getName());
                } else {
                    System.out.println("\nNo valid Id!!!");
                    writerId = -1;
                }
            } else
                System.out.println("\nInput Error!!!");
        }
        else
            System.out.println("\nNo writer added. Please add writers!");
        return writerId;
    }

    public static int selectNewsIdByCli(Writer writer){
        String input1, input2;
        Scanner scanner = new Scanner(System.in);
        int newsId = -1;

        if (writer.getAssignedNewsSize() > 0) {
            System.out.println("\nList of News:");
            writer.printAssignedNews();

            System.out.println("Select news' ID : ");
            input1 = scanner.next();
            input2 = scanner.nextLine();
            if (input2.isEmpty() && input1.matches("^\\d+$")) {
                newsId = Integer.parseInt(input1);
                /*
                if (newsId > -1 && newsId < writer.getAssignedNewsSize())
                    return newsId;
                 */
                if (newsId < 0 || newsId >= writer.getAssignedNewsSize())
                    newsId = -1;
        /*
                else
                    System.out.println("\nNo valid Id!!!");
            } else
                System.out.println("\nNo valid Id!!!");
         */
            }
            System.out.println("\nNo valid Id!!!");
        }
        else
            System.out.println("\nNo News assigned. Please assign mews to this writer!");
        return newsId;
    }
}
