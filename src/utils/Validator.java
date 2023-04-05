package utils;

import java.util.Scanner;

public class Validator {
    public static String validateNameInput(Scanner scanner) {
        String input = scanner.nextLine().trim();
        while (input.isEmpty()) {
            System.out.print(Constants.NAME_EMPTY_MSG);
            input = scanner.nextLine().trim();
        }
        return input;
    }

    // Валидация ввода количества
    public static String validateAmountInput(Scanner scanner) {
        String input = scanner.nextLine().trim();
        while (input.isEmpty() || !input.matches(Constants.AMOUNT_RGX)) {
            System.out.print(Constants.WRONG_AMOUNT_MSG);
            input = scanner.nextLine().trim();
        }
        return input;
    }

    // Валидация ввода цены
    public static String validateTariffInput(Scanner scanner) {
        String input = scanner.nextLine().trim();
        while (input.isEmpty() || !input.matches(Constants.TARIFF_RGX)) {
            System.out.print(Constants.WRONG_TARIFF_MSG);
            input = scanner.nextLine().trim();
        }
        return input;
    }
}
