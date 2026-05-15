import java.util.Random;
import java.util.Scanner;

public class Combat {

    // Combat cycle
    public static void combat(Player player, Enemy enemy) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (player.getHealth() > 0 && !enemy.isDefeated()) {
            System.out.println("You have entered combat!");
            System.out.println("What do you want to do?");
            System.out.println("Do you want to (F)ight or (R)un");
            String combatDecision = scanner.nextLine();

        }
    }
}
