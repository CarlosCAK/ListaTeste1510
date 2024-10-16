import org.junit.jupiter.api.*;

public class DatabaseConnectionTest {

    static DatabaseConnection db;

    @BeforeAll
    public static void setUp() {
        db = new DatabaseConnection();
    }
    @Test
    public void testConnection() {
        db.connect();
        Assertions.assertTrue(true,"Conectado ao banco de dados");
    }
    @Test
    public void testClose() {
        db.disconnect();
        // Se não houver exceptions ira passar no test
        Assertions.assertTrue(true,"disconectado do banco de dados");
    }
    @AfterAll
    public static void tearDown() {
        db.disconnect();
        db = null;
    }
}
