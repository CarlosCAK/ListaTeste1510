import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class PaymentServiceTest {

    @Test
    public void testPaymentService() {
        PaymentService paymentService = mock(PaymentService.class);

        OrderProcessor orderProcessor = new OrderProcessor(paymentService);

        when(paymentService.processPayment("teste",100)).thenReturn(true);

        Assertions.assertTrue(orderProcessor.processOrder("teste", 100));
    }

}
