import junit.framework.TestCase;
import java.util.Random;
import multipliers.CustomMultiplier;
import multipliers.NativeMultiplier;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultiplierParityTest extends TestCase {

    private CustomMultiplier cMul;
    private NativeMultiplier nMul;

    @Before
    public void setUp() {
        cMul = new CustomMultiplier();
        nMul = new NativeMultiplier();
    }

    @After
    public void tearDown() {
        cMul = null;
        nMul = null;
    }

    @Test
    public void testMultiplyIntegers() {
        Random random = new Random();
        for (int i = 0; i < 100; i++)
        {
            String inp1 = Long.toString(random.nextLong());
            String inp2 = Long.toString(random.nextLong());

            Assert.assertEquals(cMul.multiplyIntegers(inp1, inp2), nMul.multiplyIntegers(inp1, inp2));
        }
    }
}