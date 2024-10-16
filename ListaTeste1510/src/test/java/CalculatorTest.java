import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    static Calculator calculator;
    @BeforeAll
    public static void setUpBeforeClass() {
        calculator = new Calculator();
    }
    @Test
    public void testAdd() {
        Assertions.assertEquals(7, calculator.add(5,2));
        Assertions.assertEquals(4, calculator.add(5,-1));
        Assertions.assertEquals(5, calculator.add(5,0));
    }
    @Test
    public void testSubtract() {
        Assertions.assertEquals(3, calculator.subtract(5,2));
        Assertions.assertEquals(7, calculator.subtract(6,-1));
        Assertions.assertEquals(0, calculator.subtract(0,0));
    }
    @AfterAll
    public static void tearDownAfterClass() {
        calculator = null;
    }

}
