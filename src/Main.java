import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public static void main(){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Please enter your player name: ");
    String playerName = userInput.nextLine();
    Player player = new Player(playerName);

    //created items
    Items brokenSword = new Items("BrokenSword", 5, "Flimsy Broken Sword", 0);
    Items goldenSword = new Items("GoldenSword", 20, "Strong Golden Sword", 0);
    Items healingPotion = new Items("HealingPotion", 0, "Healing Potion that will restore 50 health", 50);
    Items key = new Items("Key", 1, "Key", 0);

    //Needed to create a player before I could add an item
    player.getInventory().addItem(brokenSword);

}
