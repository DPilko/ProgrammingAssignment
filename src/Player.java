import java.util.ArrayList;

/**
 * Class for player information such as:
 * Player position, inventory, and health.
 */

public class Player {
    public int health;
    public ArrayList<String> inventory;

    public int position;

    public Player() {
        health = 100; // This can change, just picking a random number for now
        position = 14; // Locations are numbered 1-16 starting from top left
    }

    public int getHealth() {
        return health;
    }
    public int getPosition() {
        return position;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    /*
     * For changing player position when moving
     */
    public void moveNorth() {
        row -= 4;
    }
    public void moveSouth() {
        row += 4;
    }
    public void moveEast() {
        column += 1;
    }
    public void moveWest() {
        column -= 1;
    }


    //Player can check on inventory
    public void showInventory() {
        if (inventory == null) {
            System.out.println("Inventory is empty");
            return;
        }
        System.out.println("Inventory:");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(i + ": " + inventory.get(i));
        }

    }
    //Unsure if this will work -Lachlan
    public void addItems(Items item) {
        inventory.add(item);
    }


    //Check index number user entered
    public void useItem(int index) {
        if (index < 0 || index >= inventory.size()) {
            System.out.println("Invalid item index");
            return;
        }

    Items item = inventory.get(index);

    //Checks if item has a Healing amount
    //And if health was to exceed 100, would be set to 100
    if (item.getHealingAmount() >0) {
            health += item.getHealingAmount();
            if (health > 100) {
                health = 100;
            }
            System.out.println("You have used" + item.getItemName() + "and healed");
            inventory.remove(index);
        }

    }
}

