import java.util.Scanner;



public class App {

  public static  Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
    

    startApp();
    


    myScanner.close();
    }

    public static User auth(String username, String password){
        UserDatabase userDatabase = UserDatabase.getInstace();
        return  userDatabase.checkCredit(username, password);
    }


    public  static void startApp() {

        if (myScanner.hasNextLine()) {
            myScanner.nextLine();
        }

        

        System.out.println("Enter Username: ");
        

        String username = myScanner.nextLine();

        System.out.println("Enter Password: ");
        String password = myScanner.nextLine();

        User user = auth(username, password);

        if(user!=null){
            if (user.getRole() == Role.Customer) {
                Customer customer = new Customer(username, password);
                CustomerMenu customerMenu = new CustomerMenu(customer);
                customerMenu.displayCustomerMenu();
            }else if(user.getRole() == Role.Admin){
                Admin admin = new Admin(username, password) ;
                AdminMenu adminMenu = new AdminMenu(admin);
                adminMenu.displayAdminMenu();
            }
        }else{
            System.out.println("Invaild Username or Password");
        }
    }

    
}
