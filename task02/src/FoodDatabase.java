
import java.util.ArrayList;
import java.util.Arrays;

public class FoodDatabase {
    private static FoodDatabase instance = null;

     final ArrayList<Item> sandwichList = new ArrayList<>();
     final ArrayList<Item> additionList = new ArrayList<>();

    private FoodDatabase() {
        sandwichList.addAll(Arrays.asList(
            new Item("Cheesy Bread", 10),
            new Item("Chicken Sandwich", 15),
            new Item("Beef Sandwich", 15),
            new Item("Vegetable Sandwich", 15)
        ));
        additionList.addAll(Arrays.asList(
            new Item("Cheese", 2),
            new Item("Lettuce", 1),
            new Item("Tomato", 1),
            new Item("Onion", 1)
        ));
    }

    public static FoodDatabase getInstance() {
        if (instance == null) {
            instance = new FoodDatabase();
        }
        return instance;
    }

    

    void addSandwich(Item sandwich) {
        sandwichList.add(sandwich);
    }

    void addAddition(Item addition) {
        additionList.add(addition);
    }

    void viewMenu() {
        System.out.println("~~~~~~ Menu-Sandwiches ~~~~~~ ");
        int count = 1; 
        for (Item sandwich : sandwichList) {
            System.out.println(count + ". " + sandwich.getName() + " - " + sandwich.getPrice() + " $");
            count++;
        }
    }
    

    void viewAdditions() {
        System.out.println("~~~~~~ Menu-Additions ~~~~~~ ");
        int count = 1;
        for (Item addition : additionList) {
            System.out.println(count + ". " +addition.getName() + " - " + addition.getPrice() + " $");
            count++;
        }
    }
}