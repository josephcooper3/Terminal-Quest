package gameplay;

import abilities.IFirstStrike;
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

    public String tradeBlows() {
        if (enemy instanceof IFirstStrike) {
            player.takeDamage(((IFirstStrike) enemy).firstStrike());
        }
        return player.attack(enemy);
    }

    public boolean checkPlayerWins() {
        return player.getHealthPoints() > 0 & enemy.getHealthPoints() <= 0;
    }

    public boolean checkEnemyWins() {
        return enemy.getHealthPoints() > 0 & player.getHealthPoints() <= 0;
    }
}
