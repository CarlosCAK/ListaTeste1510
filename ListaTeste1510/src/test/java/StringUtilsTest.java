import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringUtilsTest {

    @ParameterizedTest
    @CsvSource({"teste,false","'',true"})
    public void testStringToBoolean(String str, boolean expected) {
        StringUtils util = new StringUtils();
        Assertions.assertEquals(expected,util.isEmpty(str));
    }
}
