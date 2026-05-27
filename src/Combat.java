import java.util.Random;
import java.util.Scanner;

public class Combat {

    // Combat cycle
    public static void combat(Player player, Enemy enemy) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("You have entered combat with " + enemy.getName() + "!");
        while (player.getHealth() > 0 && !enemy.isDefeated()) {
            System.out.println("You have " + player.getHealth() + " health remaining!\n");
            System.out.println("What do you want to do?");
            System.out.println("Do you want to (F)ight or (R)un");
            String combatDecision = scanner.nextLine();
            boolean playerRun = false;

            if (combatDecision.equals("F")) {
                System.out.println("What item number would you like to equip?");
                player.inventory.showInventory();
                int itemNumber = scanner.nextInt();
                scanner.nextLine(); //Was creating extra inputs, this fixs
                player.inventory.useItem(itemNumber, player);

                enemy.takeDamage(player.attackDamage());

                System.out.printf("You have attacked %s and dealt %d damage.\n%s has %d health remaining\n\n",enemy.getName(),player.attackDamage(),enemy.getName(),enemy.getHealth());

                player.takeDamage(enemy.getDamage());

                System.out.printf("%s has attacked you and dealt %d to you.\n",enemy.getName(),enemy.getDamage());


            }

            else if (combatDecision.equals("R")) {
                playerRun = random.nextBoolean();
                if(playerRun){
                    System.out.println("You have fled combat");
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
