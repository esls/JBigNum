import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import validators.InputValidator;

public class AppInputValidationTest extends TestCase {

    @Test
    public void testIsValidNumber() {
        Assert.assertEquals(InputValidator.isValidNumber("123465789"), true);
        Assert.assertEquals(InputValidator.isValidNumber("-123"), true);
        Assert.assertEquals(InputValidator.isValidNumber("123465789a"), false);
        Assert.assertEquals(InputValidator.isValidNumber("abcdef"), false);
    }
}