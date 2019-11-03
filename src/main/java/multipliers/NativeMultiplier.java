package multipliers;

import java.math.BigInteger;

public class NativeMultiplier implements Multiplier {
    @Override
    public String multiplyIntegers(String number1, String number2) {
        return new BigInteger(number1).multiply(new BigInteger(number2)).toString();
    }
}
