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

}
