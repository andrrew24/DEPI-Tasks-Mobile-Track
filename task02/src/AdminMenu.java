

public class AdminMenu {
  private final Admin admin ;

   public AdminMenu(Admin admin){
         this.admin = admin;
   }


    public void displayAdminMenu() {
        String[] options = {
            "1-View Menu",
            "2-View Additions",
            "3-Add New Item To Menu",
            "4-Add New Addition",
            "5-Exit"
        };
        
        int option = 0;
    
        while (option != 5) {
            System.out.println("Options: ");
            for (String optionText : options) {
                System.out.println(" " + optionText);
            }
            System.out.println("Please Select Option: ");
    
            if (App.myScanner.hasNextInt()) {
                option = App.myScanner.nextInt();
                App.myScanner.nextLine(); 
    
                switch (option) {
                    case 1 -> admin.viewMenu();
                    case 2 -> admin.viewAdditions();
                    case 3 -> addSandwichToMenu();
                    case 4 -> addAdditionToMenu();
                    case 5 -> {
                        System.out.println("Exiting...");
                        App.startApp();
                    }
                    default -> System.out.println("Invalid option, please try again.");
                }
            } else {
                System.out.println("Invalid input, please enter a number.");
                App.myScanner.next(); 
            }
        }
    }

   private  void addSandwichToMenu(){
        System.out.println("New Sandwich: ");

        System.out.println("Enter Sandwich Name: ");
        String sandwichName = App.myScanner.nextLine();

        System.out.println("Enter Sandwich Price: ");
        int price = App.myScanner.nextInt();

        admin.addItemToMenu(new Item(sandwichName, price));

    }

    private  void addAdditionToMenu(){
        System.out.println("New Addition: ");

        System.out.println("Enter Addition Name: ");
        String sandwichName = App.myScanner.nextLine();

        System.out.println("Enter Addition Price: ");
        int price = App.myScanner.nextInt();

        admin.addAdditionToMenu(new Item(sandwichName, price));

    }
    

   
}
