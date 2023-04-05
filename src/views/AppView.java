package views;

import utils.OptionValidator;

import java.util.Scanner;

public class AppView {
    Scanner scanner;
    public int chooseOption(){
        scanner = new Scanner(System.in);

        System.out.print("""
                Choose at option:
                1 - pay cash;
                2 - pay by card;
                3 - pay by check;
                0 - close app.
                """);
        return OptionValidator.validateOptionInput(scanner);
    }
    public void getOutput(String output, int choice) {
        if (choice == 0) System.out.println(output);
        scanner.close();
        System.exit(0);
    }

}
