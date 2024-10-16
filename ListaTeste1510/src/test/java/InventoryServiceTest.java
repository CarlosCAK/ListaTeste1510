import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class InventoryServiceTest {

    static OrderService orderService;

    @BeforeAll
    public static void setUp() {
        orderService = new OrderService(new InventoryService());
    }

    @Test
    public void testOrderTrue() {
        Assertions.assertFalse(orderService.placeOrder("Mamao",4));

    }
    @AfterAll
    public static void tearDown() {
        orderService = null;
    }
}
