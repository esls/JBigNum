package validators;

public class InputValidator {
    public static Boolean isValidNumber(String input) {
        return input.matches("-?[0-9]*");
    }
}
