import abilities.Axe;
import abilities.Bow;
import beings.Berserker;
import beings.Dwarf;
import beings.Troll;
import gameplay.Battle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BattleTest {

    Axe myAxe;
    Dwarf player;
    Troll troll;
    Battle trollBattle;


    @Before
    public void before() {
        myAxe = new Axe();
        player = new Dwarf("Gimli", myAxe);
        troll = new Troll();
        trollBattle = new Battle(player, troll);
    }

    @Test
    public void hasPlayer() {
        assertEquals(player, trollBattle.getPlayer());
    }

    @Test
    public void hasEnemy() {
        assertEquals(troll, trollBattle.getEnemy());
    }

    @Test
    public void canTradeBlows() {
        trollBattle.tradeBlows();
        assertEquals(7,trollBattle.getEnemy().getHealthPoints());
    }

    @Test
    public void canTradeBlowsWithFirstStriker() {
        Berserker berserker = new Berserker();
        Battle berserkerBattle = new Battle(player, berserker);
        berserkerBattle.tradeBlows();
        assertEquals(8, player.getHealthPoints());
        assertEquals(3, berserker.getHealthPoints());
    }

    @Test
    public void playerCanWin() {
        trollBattle.tradeBlows();
        trollBattle.tradeBlows();
        trollBattle.tradeBlows();
        trollBattle.tradeBlows();
        assertEquals(true, trollBattle.checkPlayerWins());
    }

    @Test
    public void enemyCanWin() {
        Bow myBow = new Bow();
        player.changeWeapon(myBow);
        Berserker berserker = new Berserker();
        Battle berserkerBattle = new Battle(player, berserker);
        berserkerBattle.tradeBlows();
        berserkerBattle.tradeBlows();
        berserkerBattle.tradeBlows();
        berserkerBattle.tradeBlows();
        berserkerBattle.tradeBlows();
        assertEquals(true, berserkerBattle.checkEnemyWins());
    }

}
