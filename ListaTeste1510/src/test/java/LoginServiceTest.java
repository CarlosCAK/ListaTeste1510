import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginServiceTest {

    @Test
    public void testValidLogin() {
        LoginService test = new LoginService();
        Assertions.assertTrue(test.login("user","password"));
    }
    @Test
    public void testInvalidLogin() {
        LoginService test = new LoginService();
        Assertions.assertFalse(test.login("user","wrongPassword"));
    }
}
