public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password, Role.Admin);
    }


    public void addItemToMenu(Item sandwich) {
        foodDatabase.addSandwich(sandwich);
    }

    public void addAdditionToMenu(Item addition) {
        foodDatabase.addAddition(addition);
    }
}
