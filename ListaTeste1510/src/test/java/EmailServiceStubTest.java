import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailServiceStubTest {

    @Test
    public void sendEmailTest() {
        UserService userServiceStub = new UserService(new EmailServiceStub());

        Assertions.assertTrue(userServiceStub.registerUser("Carlos@gmail.com"));
        Assertions.assertFalse(userServiceStub.registerUser(""));

    }

}
