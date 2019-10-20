package gameplay;

import abilities.IFirstStrike;
import beings.Dwarf;
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

    public void tradeBlows() {
        if (enemy instanceof IFirstStrike) {
            player.takeDamage(((IFirstStrike) enemy).firstStrike());
        }
        player.attack(enemy);
    }

    public boolean checkPlayerWins() {
        if (player.getHealthPoints() > 0 & enemy.getHealthPoints() <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkEnemyWins() {
        if (enemy.getHealthPoints() > 0 & player.getHealthPoints() <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
