package gameplay;

import abilities.Axe;
import abilities.Sword;
import beings.Dwarf;
import beings.Knight;
import beings.Player;
import beings.Troll;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Player player;
        Axe axe = new Axe();
        Sword sword = new Sword();
        Troll troll = new Troll();

        System.out.println("Welcome to Terminal Quest! What is your name?");

        String playerName = scanner.next();

        System.out.println("Would you like to play as a Knight or a Dwarf?");

        String playerClass = scanner.next();

        if (playerClass == "Knight") {
            player = new Knight(playerName, sword);
        } else if (playerClass == "Dwarf") {
            player = new Dwarf(playerName, axe);
        }

    }

}
