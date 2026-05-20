import java.util.Random;
import java.util.Scanner;

public class Combat {

    // Combat cycle
    public static void combat(Player player, Enemy enemy) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("You have entered combat with " + enemy.getName() + "!");
        while (player.getHealth() > 0 && !enemy.isDefeated()) {
            System.out.println("You have " + player.getHealth() + " health remaining!");
            System.out.println("What do you want to do?");
            System.out.println("Do you want to (F)ight or (R)un");
            String combatDecision = scanner.nextLine();
            boolean playerRun = false;

            if (combatDecision.equals("F")) {

            }

            else if (combatDecision.equals("R")) {
                playerRun = random.nextBoolean();
                if(playerRun){
                    System.out.println("You have flee combat");
                    break;
                }
                else{
                    System.out.println("You failed to run away and the " + enemy.getName() + " got a critical hit in!");
                    //Added the +1, s that player is given at least on more chance to fight
                    player.setHealth((player.getHealth() / 2) + 1);
                }
            }

            else{
                System.out.println("Invalid combat choice. Please try again.");
            }
        }
        if(player.getHealth() <= 0){
            System.out.println("You have died in combat to " + enemy.getName() + "!");
        }
    }
}
