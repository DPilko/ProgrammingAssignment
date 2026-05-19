import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public static void main(){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Please enter your player name: ");
    String playerName = userInput.nextLine();
    Player player = new Player(playerName);

    //Creating Items
    //Items brokenSword = new Items("BrokenSword", 5, "Flimsy Broken Sword", 0);
    //Items goldenSword = new Items("GoldenSword", 20, "Strong Golden Sword", 0);
    //Items healingPotion = new Items("HealingPotion", 0, "Healing Potion that will restore 50 health", 20);
    //Items key = new Items("Key", 1, "Key", 0);


    //Puts broken sword into inventory
    //player.getInventory().addItem(brokenSword);

    //Creating Bosses
    Enemy miniBoss1 = new Enemy("Miniboss1", 30 ,20 );
    Enemy miniBoss2 = new Enemy("MiniBoss2", 50 ,35 );
    Enemy finalBOSS = new Enemy("FinalBOSS", 200 ,40 );

}
