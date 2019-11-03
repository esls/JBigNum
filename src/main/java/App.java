import multipliers.CustomMultiplier;
import multipliers.Multiplier;
import multipliers.NativeMultiplier;
import validators.InputValidator;

public class App {
    public static void main(String[] args) {
        if (args.length < 0)
        {
            printHelp();
            return;
        }
        Multiplier selectedAlgo;
        switch (args[0].toLowerCase())
        {
            case "--alg1":
            case "custom":
                selectedAlgo = new CustomMultiplier();
                break;
            case "--alg2":
            case "native":
                selectedAlgo = new NativeMultiplier();
                break;
            default:
                System.out.println("Invalid algorithm specified.");
                printHelp();
                return;
        }
        if (!InputValidator.isValidNumber(args[1]) || !InputValidator.isValidNumber(args[2]))
        {
            System.out.println("Integers are required for calculation.");
            return;
        }
        System.out.println(selectedAlgo.multiplyIntegers(args[1], args[2]));
    }

    private static void printHelp() {
        System.out.println("Usage: <algorithm type> <number1> <number2>");
        System.out.println("Algorithm types: custom (--alg1), native (--alg2)");
    }
}
