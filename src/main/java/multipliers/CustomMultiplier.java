package multipliers;

public class CustomMultiplier implements Multiplier {
    @Override
    public String multiplyIntegers(String number1, String number2) {
        Boolean prefixMinus = false;
        if (number1.startsWith("-"))
        {
            number1 = number1.replace("-", "");
            prefixMinus = true;
        }
        if (number2.startsWith("-"))
        {
            number2 = number2.replace("-", "");
            prefixMinus = !prefixMinus;
        }
        int[] result = new int[number1.length() + number2.length()];
        for (int i = number1.length() - 1; i >= 0; i--)
        {
            int carry = 0;
            for (int j = number2.length() - 1; j >= 0; j--)
            {
                result[i + j + 1] += (number1.charAt(i) - '0') * (number2.charAt(j) - '0') + carry;
                carry = result[i + j + 1] / 10;
                result[i + j + 1] %= 10;
            }
            if (carry > 0)
                result[i] += carry;
        }
        StringBuilder sb = new StringBuilder();
        for (int i : result)
            sb.append(i);
        return (prefixMinus ? "-" : "") + sb.toString().replaceFirst("^0+(?!$)", "");
    }
}
