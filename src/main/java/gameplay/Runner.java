package gameplay;

import abilities.Axe;
import beings.*;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Terminal Quest! What is your name?");

        String playerName = scanner.next();
        Axe weapon = new Axe();
        Dwarf player = new Dwarf(playerName, weapon);

        System.out.println(String.format("Greetings, brave adventurer %s! You are playing as a Dwarf wielding a mighty %s.", playerName, weapon.getType()));

        System.out.println("A wild Imp appeared!");

        Imp imp = new Imp();
        Battle impBattle = new Battle(player, imp);

        System.out.println(String.format("Attack the Imp with your %s?", weapon.getType()));

        String input = scanner.next();

        if (input.toLowerCase().contains("y")) {
            System.out.println(impBattle.tradeBlows());
        }

        if (impBattle.checkPlayerWins()) {
            System.out.println("You destroyed the foul Imp!");
        }

    }

}
