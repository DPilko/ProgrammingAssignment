import java.util.ArrayList;

//Test update

//Created an Inventory class to clear clutter from Player class
public class Inventory {

    //Defining a private array, which will be created when Inventory is called.
    private ArrayList<Items> items;

    //Creating that inventory
    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Items item) {
        items.add(item);
    }

    //Player can check on inventory
    public void showInventory() {
       //Will break out if nothing is in inventory
        if (items == null) {
            System.out.println("Inventory is empty");
            return;
        }
        //Else will print each invenotry item 1 by 1
        System.out.println("Inventory:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + ": " + items.get(i));
        }

    }


    //Check index number user entered and makes sure it is an index that exists.
    public void useItem(int index, Player player) {
        if (index < 0 || index >= items.size()) {
            System.out.println("Invalid item slot/index");
            return;
        }

        //Uses that index number to set the corresponding item.
        Items item = items.get(index);

        //Checks if item has a Healing amount value
        //And if health was to exceed 100, would be set to 100
        if (item.getHealingAmount() >0) {
            player.heal(item.getHealingAmount());

            System.out.println("You have used" + item.getItemName() + "and healed");
            //If item is used, it will then be removed from Inventory
            items.remove(index);
        }
        else{
            System.out.println("Thsi item cannot heal you");
        }

    }
}
