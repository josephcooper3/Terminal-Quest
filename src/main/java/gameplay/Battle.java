package gameplay;

import beings.Enemy;
import beings.Player;

public class Battle {

    private Player player;
    private Enemy enemy;

    public Battle(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public Player getPlayer() {
        return player;
    }

    public Enemy getEnemy() {
        return enemy;
    }

}
