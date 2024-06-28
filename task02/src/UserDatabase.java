
import java.util.ArrayList;

public class UserDatabase {

    private static UserDatabase instance = null;
    private final ArrayList<User> userList = new ArrayList<>();

    private UserDatabase(){
        userList.add(new User("customer1", "1234", Role.Customer));
        userList.add(new User("Admin", "1234", Role.Admin));
    }

    public static UserDatabase getInstace(){
        if (instance == null) {
            instance = new UserDatabase();
        }
        return instance;
    }


   public User checkCredit(String username, String password) {
    for (User user : userList) {
        if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
            return user;
        }
    }
    return null;
   }
}
