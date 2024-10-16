import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    private static TemperatureConverter temperatureConverter;

    @BeforeAll
    public static void setUp() {
        temperatureConverter = new TemperatureConverter();
    }
    @Test
    public void testConvertToCelsius() {
        Exception exception = Assertions.assertThrows(Exception.class, () -> temperatureConverter.
                celsiusToKelvin(-273.16));

        Assertions.assertEquals("Temperatura abaixo do zero absoluto", exception.getMessage());
    }

    @AfterAll
    public static void tearDown() {
        temperatureConverter = null;
    }
}
