public class Main {
    public static void main(String[] args) throws Exception {
        Database database = new Database();
        
        String username = "Admin";
        String password = "1234";
        User user = database.authenticate(username, password);
        user.printUser();
    }
}

