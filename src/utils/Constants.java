package utils;

public class Constants {
    public final static String AMOUNT_RGX = "[0-9]+";

    // Регулярное выражение
    // для валидации ввода цены.
    // Можно только цифры.
    // Можно double значения, но не более 10-ти цифр
    // перед десятичным разделителем.
    public final static String TARIFF_RGX = "[0-9]{1,10}(.[0-9]*)?";

    public final static String NO_SUCH_OPTION_MSG = "There is no such option! Try again: ";
    public final static String NAME_EMPTY_MSG = "Empty name value! Try again: ";
    public final static String WRONG_AMOUNT_MSG = "Wrong quantity value! Try again: ";
    public final static String WRONG_TARIFF_MSG = "Wrong price value! Try again: ";
    public final static String NAN_NUMBER_MSG = "\"%s\" - not a number!%nTry again: ";
    public final static String JOB_QUIT_MSG = "\n>> Job completed.";
}
