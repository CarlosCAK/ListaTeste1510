import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ComplexNumberCalculatorTest {

    static ComplexNumber n1;
    static ComplexNumber n2;

    @BeforeAll
    public static void setUpBeforeClass() {
        n1 = new ComplexNumber(3,4);
        n2 = new ComplexNumber(1,-2);
    }

    @Test
    public void testAdd() {
        ComplexNumber result = n1.add(n2);
        Assertions.assertEquals(4, result.getReal());
        Assertions.assertEquals(2, result.getImag());
    }
    @Test
    public void testSubtract() {
        ComplexNumber result = n1.subtract(n2);
        Assertions.assertEquals(2, result.getReal());
        Assertions.assertEquals(6, result.getImag());
    }
    @Test
    public void testMultiply() {
        ComplexNumber result = n1.multiply(n2);
        Assertions.assertEquals(11, result.getReal());
        Assertions.assertEquals(-2, result.getImag());
    }
    @Test
    public void testDivide() {
        ComplexNumber result = n1.divide(n2);
        Assertions.assertEquals(-1, result.getReal());
        Assertions.assertEquals(2, result.getImag());
    }

}
