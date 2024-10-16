import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    static BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount(1000);
    }
    @Test
    public void withDrowTest(){
        Exception exception = Assertions.assertThrows(Exception.class, () -> bankAccount.withdraw(2000));
        Assertions.assertEquals(exception.getMessage(),"Saldo insuficiente");
    }
    @BeforeEach
    public void tearDown() {
        bankAccount = null;
    }


}
