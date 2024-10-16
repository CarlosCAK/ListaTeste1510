import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EmailServiceTest {



    @Test
    public void testEmailService() {
       NotificationService notificationService = new NotificationService(new EmailService());

       Assertions.assertFalse(notificationService.notifyUser("",""));
       Assertions.assertFalse(notificationService.notifyUser("  ","  "));
       Assertions.assertTrue(notificationService.notifyUser("Carlos","Eai cara"));

    }
}
