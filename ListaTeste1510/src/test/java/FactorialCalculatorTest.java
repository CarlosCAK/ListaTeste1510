import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FactorialCalculatorTest {

    static FactorialCalculator calculator;

    @BeforeAll
    static void setUpBeforeClass(){
        calculator = new FactorialCalculator();
    }
    @Test
    void testFactorial() {

        long initialTime = System.nanoTime();

        calculator.factorial(80);

        long finalTime = System.nanoTime();

        long result = finalTime - initialTime;

        System.out.println("Duração do fatorial "+result);
    }
    @AfterAll
    public static void tearDownAfterClass(){
        calculator = null;
    }
}
