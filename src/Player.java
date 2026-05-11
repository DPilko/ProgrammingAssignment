/**
 * Class for player information such as:
 * Player position, inventory, and health.
 */

public class Player {
    public int health;
    public ArrayList<> inventory;

    public int row;
    public int column;

    public Player() {
        health = 100; // This can change, just picking a random number for now
        row = 4;
        column = 2;
    }

    public int getHealth() {
        return health;
    }
    public int getRow() {
        return row;
    }
    public int getColumn() {
        return column;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    /*
     * For changing player position when moving
     */
    public void moveNorth() {
        row--;
    }
    public void moveSouth() {
        row++;
    }
    public void moveEast() {
        column++;
    }
    public void moveWest() {
        column--;
    }

}
