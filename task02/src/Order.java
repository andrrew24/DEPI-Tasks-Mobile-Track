

import java.util.ArrayList;

public class Order {
   private   Item sandwich ;
   private  ArrayList<Item> additions = new ArrayList<>();

     

    public void setSandwich(Item sandwichies) {
        this.sandwich = sandwichies;
    }

    public void setAdditions(ArrayList<Item> additions) {
        this.additions = additions;
    }

    public Item getSandwich() {
        return sandwich;
    }

    public ArrayList<Item> getAdditions() {
        return additions;
    }

    
}
