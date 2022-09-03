import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String args[]) {
        Random random = new Random();

        int space = 0; // initial space
        int diceRoll;
        Scanner input = new Scanner(System.in);

        /*
        for (int i = 0; i < 4; i++) {
            diceRoll = random.nextInt(6) + 1; //to exclude 0
            space = space + diceRoll;
            if (space > 20) {
                System.out.print("Roll #" + (i + 1) + ":" + "You've rolled a " + diceRoll + ". ");
                break;
            }
            System.out.println("Roll #" + (i + 1) + ":" + "You've rolled a " + diceRoll +
                    ". You are now on space " + space + " and have " + (20 - space) + " to go");
        }

        if (space > 20) {
            System.out.print("You went over 20. You lose.");
        } else {
            //last roll
            diceRoll = random.nextInt(6) + 1;
            space = space + diceRoll;

            System.out.print("Roll #5:You've rolled a " + diceRoll + ". ");
            if (space > 20) {
                System.out.print("You went over 20. You lose.");
            } else if (space < 20) {
                System.out.println("You are on space " + space + ". You went under 20. You lose.");
            } else
                System.out.println("Congrats you landed on 20.");
        }*/

        for (int i = 0; i < 5; i++) {

            System.out.print("Type any key to roll the dice: ");
            String anyKey = input.next();
            diceRoll = random.nextInt(6) + 1;
            space = space + diceRoll;

            if (space > 20) {
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + diceRoll + ".");
                break;
            }
            System.out.println("Roll #" + (i + 1) + ": You've rolled a " + diceRoll + ". You are now on space " +
                    space + " and have " + (20 - space) + " more to go.");
            if (space == 20) {
                break;
            }

        }
        if (space < 20) {
            System.out.println("No more turns and you are still under 20. You lose!");
        } else if (space > 20) {
            System.out.println("You went over 20. You lose!");
        } else {
            System.out.println("Congrats, you won!");
        }
    }
}