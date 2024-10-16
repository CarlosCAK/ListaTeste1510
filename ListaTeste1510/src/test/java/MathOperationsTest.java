import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MathOperationsTest {

    @ParameterizedTest
    @CsvSource({"2,3,5","2,7,9","10,20,30"})
    public void testAdd(int a, int b, int expected) {
        MathOperations m = new MathOperations();
        Assertions.assertEquals(expected, m.add(a, b));
    }


}
