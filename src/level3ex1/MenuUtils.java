package level3ex1;

import java.util.Scanner;

public class MenuUtils {
    public static String inputStringByCli(String msg) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (input.isEmpty()){
            System.out.println(msg);
            input = scanner.nextLine();
        }
        return input;
    }
}
