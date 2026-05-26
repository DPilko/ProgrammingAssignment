import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public static void main(){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Please enter your player name: ");
    String playerName = userInput.nextLine();
    Player player = new Player(playerName);

    //Creating Items
    Items brokenSword = new Items("BrokenSword", "Flimsy Broken Sword", 5, 0);
    Items goldenSword = new Items("GoldenSword", "Strong Golden Sword", 20, 0);
    Items healingPotion = new Items("HealingPotion", "Healing Potion that will restore 20 health", 0, 20);
    Items key = new Items("Key", "Key", 0, 0);
    Items goldenKey = new Items("GoldenKey", "Key to unlock dungeon exit", 0, 0);


//    Puts broken sword into inventory
//    player.getInventory().addItem(brokenSword);

    //Creating Bosses
    Enemy miniBoss1 = new Enemy("Miniboss1", 30 ,20 );
    Enemy miniBoss2 = new Enemy("MiniBoss2", 50 ,35 );
    Enemy finalBOSS = new Enemy("FinalBOSS", 200, 40);

    // Creating Boss Room
    List<Items> throneRoomItems = new ArrayList<>();
    throneRoomItems.add(goldenKey);
    Room kingsThrone = new Room("Kings Throne", "Final boss room", "Defeated final boss room", throneRoomItems,
            finalBOSS, null);

    //Example start combat
    Combat.combat(player, finalBOSS);
}
