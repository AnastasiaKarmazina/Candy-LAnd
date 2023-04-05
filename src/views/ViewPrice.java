package views;

import utils.Validator;

import java.util.Scanner;

public class ViewPrice {
    String title;
    Scanner scanner;

    public String[] getData() {
        scanner = new Scanner(System.in);

        title = "Name product: ";
        System.out.print(title);
        String name = Validator.validateNameInput(scanner);

        title = "Amount product: ";
        System.out.print(title);
        String amount = Validator.validateAmountInput(scanner);

        title = "Tariff: ";
        System.out.print(title);
        String tariff = Validator.validateTariffInput(scanner);

        scanner.close();
        return new String[]{name, amount, tariff};
    }
    public void getOutput(String output){
        System.out.println(output);
    }
}
