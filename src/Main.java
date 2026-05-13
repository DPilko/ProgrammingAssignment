import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public static void main(){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Please enter your player name: ");
    String playerName = userInput.nextLine();
    Player player = new Player(playerName);

    //created first item
    Items brokenSword = new Items("BrokenSword", 5, "Flimsy Broken Sword", 0);

    //Needed to create a player before I could add an item
    player.getInventory().addItem(brokenSword);

}
