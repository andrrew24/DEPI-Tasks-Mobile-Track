public abstract class User {
    private final String name;
    private final String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    void printUser(){
        System.out.println("Name: " + name);
    }

    public String getUsername() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
