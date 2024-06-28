public class User {
    private final String username;
    private final String password;
    private final  Role role;

    public User(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }


    FoodDatabase foodDatabase = FoodDatabase.getInstance();
    
    public void viewMenu() {
        foodDatabase.viewMenu();
    }

    public void viewAdditions() {
        foodDatabase.viewAdditions();
    }

    
}
