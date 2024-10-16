import java.util.HashMap;
import java.util.Map;

public class LoginService {

    private Map<String,String> users;

    public LoginService() {
        this.users = new HashMap<>();
    }

    public boolean login(String user, String password) {
        users.put("user", "password");
        return users.containsKey(user) && users.get(user).equals(password);
    }
}
