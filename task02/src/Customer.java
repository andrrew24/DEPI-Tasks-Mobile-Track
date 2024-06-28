
import java.util.ArrayList;


public class Customer extends User {
    public Customer(String username, String password) {
        super(username, password, Role.Customer);
    }

    public Item selectSandwich(int selection){
        return this.foodDatabase.sandwichList.get(selection-1);
    }
    
    public ArrayList<Item> selectAdditions(String selections) {
        ArrayList<Item> selectedItems = new ArrayList<>();
        String[] selectionArray = selections.split(",");
    
        for (String selection : selectionArray) {
            try {
                int index = Integer.parseInt(selection.trim()) - 1;
                if (index >= 0 && index < this.foodDatabase.additionList.size()) {
                    selectedItems.add(this.foodDatabase.additionList.get(index));
                } else {
                    System.out.println("Selection out of range: " + selection);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection: " + selection);
            }
        }
    
        return selectedItems;
    }
}
