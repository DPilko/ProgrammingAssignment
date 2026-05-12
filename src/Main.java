import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public static void main(){
    System.out.println("Hello World");

    Items brokenSword = new Items("BrokenSword", 5, "Flimsy Broken Sword", 0);
    //tring to link this to addItems in player row 60
    Player.addItems(Items brokenSword);

}
