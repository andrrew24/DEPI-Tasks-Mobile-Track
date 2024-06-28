
import java.util.ArrayList;

public class CustomerMenu {
    private final Customer customer;

    public CustomerMenu(Customer customer) {
        this.customer = customer;
    }

    

    public void displayCustomerMenu() {
        System.out.println("Welcome to our restaurant");

        customer.viewMenu();

        Order order = getOrder();

        showOrder(order);

        confirmOrder(order);

        backtomenuORExit();

    }

    private void backtomenuORExit() {
        System.out.println("1. Back to menu");
        System.out.println("2. Exit");

        int option = App.myScanner.nextInt();

        switch (option) {
            case 1 -> displayCustomerMenu();
            case 2 -> App.startApp();
            default -> {
                System.out.println("Invalid Option");
                backtomenuORExit();
                break;
            }
        }
    }

    private void confirmOrder(Order order) {
        System.out.println("1. Confirm   ");
        System.out.println("2. Back to menu");

        int selection = App.myScanner.nextInt();

        switch (selection) {
            case 1 -> printReceipt(order);
            default -> displayCustomerMenu();
        }
    }

    private  void printReceipt(Order order) {

        int total = order.getSandwich().getPrice() ;
        System.out.println("Receipt: ");
        System.out.println("1    " + order.getSandwich().getName() + "\t" + order.getSandwich().getPrice()+"$");
        for (Item addition : order.getAdditions()) {
            System.out.println("1    " + addition.getName() + "\t" + addition.getPrice()+"$");
            total += addition.getPrice();
        }
        System.out.println("----------------------");
        System.out.println("Total: " + total +"$");
    }

    private Order getOrder() {
        System.out.println("please select one option: ");

        Order order = new Order();

        int selection = App.myScanner.nextInt();

        System.out.println("Do you like to add any additions ");
        System.out.println("\t 1-Yes");
        System.out.println("\t 2-No");

        int option = App.myScanner.nextInt();

        switch (option) {
            case 1 -> {
                order.setSandwich(customer.selectSandwich(selection));
                order.setAdditions(getAdditionsFromCustomer());
            }
            case 2 -> order.setSandwich(customer.selectSandwich(selection));
            default -> {
                System.out.println("Invalid Option");
                getOrder();
            }

        }
        return order;
    }

    public ArrayList<Item> getAdditionsFromCustomer() {
        customer.viewAdditions();

        System.out.println("Select multiple options");

        if (App.myScanner.hasNextLine()) {
            App.myScanner.nextLine();
        }
        String selections = App.myScanner.nextLine();

        return customer.selectAdditions(selections);
    }

    public void showOrder(Order order) {
        System.out.println("Your Order is");
        System.out.println("\t1. " + order.getSandwich().getName());
        if (!order.getAdditions().isEmpty()) {
            System.out.println("Additions: ");
            int counter = 1;
            for (Item addition : order.getAdditions()) {
                System.out.println("\t"+counter + ". " + addition.getName());
                counter++;
            }
            System.out.println();
        }
    }
}
