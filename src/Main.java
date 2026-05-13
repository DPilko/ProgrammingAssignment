import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public static void main(){
    System.out.println("Hello World");

    //created first item
    Items brokenSword = new Items("BrokenSword", 5, "Flimsy Broken Sword", 0);

    //Needed to create a player before i could add an item
    Player player = new Player();
    player.addItem(brokenSword);

}
